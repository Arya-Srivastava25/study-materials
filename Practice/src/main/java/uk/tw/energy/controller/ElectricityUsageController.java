package uk.tw.energy.controller;

import io.micrometer.common.util.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.tw.energy.service.AccountService;
import uk.tw.energy.service.ElectricityUsageServiceImpl;

import java.math.BigDecimal;

@RestController
@RequestMapping("/usage")
public class ElectricityUsageController {

    ElectricityUsageServiceImpl electricityUsageService;
    AccountService accountService;

    public ElectricityUsageController(ElectricityUsageServiceImpl electricityUsageService, AccountService accountService){
        this.electricityUsageService = electricityUsageService;
        this.accountService = accountService;
    }
    @GetMapping("/week/{smartMeterId}")
    public ResponseEntity<BigDecimal> calculateCostForPastWeek(@PathVariable String smartMeterId){
        if(StringUtils.isEmpty(accountService.getPricePlanIdForSmartMeterId(smartMeterId)))
            ResponseEntity.notFound().build();

        BigDecimal costPerWeek = electricityUsageService.calculateCostForAWeek(smartMeterId);

        return ResponseEntity.ok(costPerWeek);
    }
}
