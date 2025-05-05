package SingletonClassExample;

public class DBConnectionLazyInitialization {
    private static DBConnectionLazyInitialization dbConnectionLazyInitialization;

    private DBConnectionLazyInitialization(){}

    public static DBConnectionLazyInitialization getInstance(){
        if(dbConnectionLazyInitialization == null)
            dbConnectionLazyInitialization = new DBConnectionLazyInitialization();
        return dbConnectionLazyInitialization;
    }
}
