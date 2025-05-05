package DoubleCheckedLock;

public class DoubleCheckedLockDBConnection {
    private static volatile DoubleCheckedLockDBConnection doubleCheckedLockDBConnection;

    private DoubleCheckedLockDBConnection(){}

    public static DoubleCheckedLockDBConnection getInstance(){
        if(doubleCheckedLockDBConnection == null){
            synchronized (DoubleCheckedLockDBConnection.class){
                if(doubleCheckedLockDBConnection == null)
                    doubleCheckedLockDBConnection = new DoubleCheckedLockDBConnection();
            }
        }
        return doubleCheckedLockDBConnection;
    }
}
