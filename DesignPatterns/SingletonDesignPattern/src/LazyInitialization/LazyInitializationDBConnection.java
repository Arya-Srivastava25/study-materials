package LazyInitialization;

public class LazyInitializationDBConnection {
    private static LazyInitializationDBConnection lazyInitializationDBConnection;

    private LazyInitializationDBConnection(){}

    public static LazyInitializationDBConnection getInstance(){
        if(lazyInitializationDBConnection == null)
            lazyInitializationDBConnection = new LazyInitializationDBConnection();
        return lazyInitializationDBConnection;
    }
}
