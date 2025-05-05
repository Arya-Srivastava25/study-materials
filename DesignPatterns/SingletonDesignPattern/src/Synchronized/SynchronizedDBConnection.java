package Synchronized;

public class SynchronizedDBConnection {
    private static SynchronizedDBConnection synchronizedDBConnection;

    private SynchronizedDBConnection(){}

    public static synchronized SynchronizedDBConnection getInstance(){
        if(synchronizedDBConnection == null)
            synchronizedDBConnection = new SynchronizedDBConnection();
        return synchronizedDBConnection;
    }
}
