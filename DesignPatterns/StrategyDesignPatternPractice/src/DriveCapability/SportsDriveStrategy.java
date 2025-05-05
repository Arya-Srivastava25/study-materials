package DriveCapability;

import java.sql.SQLOutput;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports");
    }
}
