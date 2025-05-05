package SingletonClassExample;

public class DBConnectionSynchronizedMethod {
    private static DBConnectionSynchronizedMethod dbConnectionSynchronizedMethod;

    private DBConnectionSynchronizedMethod(){}

    synchronized public static DBConnectionSynchronizedMethod getInstance(){
        if(dbConnectionSynchronizedMethod == null)
            dbConnectionSynchronizedMethod = new DBConnectionSynchronizedMethod();
        return dbConnectionSynchronizedMethod;
    }
}
