package uk.tw.energy.service;

import uk.tw.energy.domain.ElectricityReading;
import uk.tw.energy.domain.PricePlan;
import uk.tw.energy.serviceInterface.PowerUsage;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ElectricityUsageServiceImpl implements PowerUsage {

    AccountService accountService;
    private final List<PricePlan> pricePlans;
    private final MeterReadingService meterReadingService;

    public ElectricityUsageServiceImpl(AccountService accountService, List<PricePlan> pricePlans, MeterReadingService meterReadingService) {
        this.accountService = accountService;
        this.pricePlans = pricePlans;
        this.meterReadingService = meterReadingService;
    }

    public BigDecimal calculateCostForAWeek(String smartMeterId){
        String pricePlan = accountService.getPricePlanIdForSmartMeterId(smartMeterId);

        Optional<List<ElectricityReading>> electricityReadings = meterReadingService.getReadings(smartMeterId);
        List<ElectricityReading> lastWeekReadings = null;
        if(!electricityReadings.isPresent()) {
            throw new IllegalStateException();
        }

        lastWeekReadings = electricityReadings.get().stream().filter((reading) -> reading.time().isAfter(Instant.now().minusSeconds(24 * 7 * 60 * 60))).collect(Collectors.toList());

        BigDecimal totalPowerConsumptionInWeek = BigDecimal.ZERO;

        for(ElectricityReading reading : lastWeekReadings)
            totalPowerConsumptionInWeek.add(reading.reading());

        BigDecimal averageElectricityConsumptionInLastWeek = totalPowerConsumptionInWeek.divide(BigDecimal.valueOf(lastWeekReadings.size()));

        BigDecimal energyConsumed = averageElectricityConsumptionInLastWeek.multiply(BigDecimal.valueOf(24*7));

        Optional<PricePlan> price = pricePlans.stream().filter(currentPlan -> currentPlan.getPlanName().equals(pricePlan)).findFirst();

        return energyConsumed.multiply(price.get().getUnitRate());
    }
}
