package ElevatorDesign;

import java.util.List;

public class Main {
}

enum Direction{
    UP,
    DOWN
}
abstract class Button{
    boolean state;

    public void press(){

    }
    abstract boolean isPressed();
}
class FloorButton extends Button{
    int floor;
    @Override
    public boolean isPressed(){
        return true;
    }
}

class DoorButton extends Button{
    @Override
    public boolean isPressed(){
        return true;
    }
}

class HallButton extends Button{
    Direction direction;
    @Override
    public boolean isPressed(){
        return true;
    }
}

class Display{
    int floor;
    Direction direction;
    int capacity;
}
class ElevatorPanel{
    List<FloorButton> floorButtons;
    DoorButton open;
    DoorButton close;
}

class FloorPanel{
    HallButton up;
    HallButton down;
}

enum DoorState{
    CLOSED,
    OPEN
}
class Door{
    DoorState doorState;
    public boolean isOpen(){
        return true;
    }
}

enum ElevatorState{
    UP,
    DOWN,
    IDLE
}
class Elevator{
    ElevatorState elevatorState;
    Door door;
    ElevatorPanel elevatorPanel;
    Display display;

    public void move(){}
    public void stop(){}
    public void openDoor(){}
    public void closeDoor(){}

}

class Floor{
    List<FloorPanel> floorPanel;
    List<Display> display;

    public boolean isTopFloor(){
        return true;
    }

    public boolean isBottomFloor(){
        return true;
    }

}

class ElevatorSystem{

    List<Elevator> elevators;
    List<Floor> floors;
    private static ElevatorSystem elevatorSystem = null;
    private ElevatorSystem(){
    }

    public static ElevatorSystem getInstance(){
        if(elevatorSystem == null)
            elevatorSystem = new ElevatorSystem();
        return elevatorSystem;
    }
}

class Building{
    ElevatorSystem elevatorSystem;

    private static Building building = null;

    private Building(){

    }

    public static Building getInstance(){
        if(building == null)
                building = new Building();
        return building;
    }
}