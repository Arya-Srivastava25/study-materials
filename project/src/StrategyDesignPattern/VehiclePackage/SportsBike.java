package StrategyDesignPattern.VehiclePackage;

import StrategyDesignPattern.DriveCapability.SportsDriveStrategy;

public class SportsBike extends Vehicle{

    public SportsBike(){
        super(new SportsDriveStrategy());
    }
}
