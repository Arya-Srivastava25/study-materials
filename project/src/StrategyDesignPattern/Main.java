package StrategyDesignPattern;

import StrategyDesignPattern.DriveCapability.SportsDriveStrategy;
import StrategyDesignPattern.VehiclePackage.NormalBike;
import StrategyDesignPattern.VehiclePackage.SportsBike;
import StrategyDesignPattern.VehiclePackage.Vehicle;

public class Main {
    public static void main(String[] args){
        Vehicle sportsBike = new SportsBike();
        Vehicle normalBike = new NormalBike();

        sportsBike.drive();
        normalBike.drive();
    }
}
