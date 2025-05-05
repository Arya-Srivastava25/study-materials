package uk.tw.energy.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import uk.tw.energy.service.AccountService;
import uk.tw.energy.service.ElectricityUsageServiceImpl;

public class ElectricityUsageControllerTest {

    private static final String SMART_METER_ID = "010101";
    @Mock
    ElectricityUsageServiceImpl electricityUsageService;
    @Mock
    AccountService accountService;

    @InjectMocks
    ElectricityUsageController electricityUsageController;



    @Test
    public void handlePricePlanNotAssociatedWithSmartIdExceptionTest(){

    }

}
