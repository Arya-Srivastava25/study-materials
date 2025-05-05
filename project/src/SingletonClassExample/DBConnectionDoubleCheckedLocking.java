package SingletonClassExample;

public class DBConnectionDoubleCheckedLocking {

    private volatile static DBConnectionDoubleCheckedLocking dbConnectionDoubleCheckedLocking;

    private DBConnectionDoubleCheckedLocking(){}

    public static DBConnectionDoubleCheckedLocking getInstance(){
        if(dbConnectionDoubleCheckedLocking == null){
            synchronized (DBConnectionSynchronizedMethod.class){
                if(dbConnectionDoubleCheckedLocking == null)
                    dbConnectionDoubleCheckedLocking = new DBConnectionDoubleCheckedLocking();
            }
        }
        return dbConnectionDoubleCheckedLocking;
    }
}
