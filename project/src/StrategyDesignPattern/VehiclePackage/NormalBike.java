package StrategyDesignPattern.VehiclePackage;

import StrategyDesignPattern.DriveCapability.NormalDriveStrategy;

public class NormalBike extends Vehicle{

    public NormalBike(){
        super(new NormalDriveStrategy());
    }
}
