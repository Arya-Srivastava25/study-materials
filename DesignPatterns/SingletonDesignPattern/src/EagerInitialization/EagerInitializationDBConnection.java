package EagerInitialization;

public class EagerInitializationDBConnection {
    private static EagerInitializationDBConnection eagerInitializationDBConnection = new EagerInitializationDBConnection();

    private EagerInitializationDBConnection(){

    }

    public static EagerInitializationDBConnection getInstance(){
        return eagerInitializationDBConnection;
    }
}
