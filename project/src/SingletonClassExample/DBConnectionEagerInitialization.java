package SingletonClassExample;

public class DBConnectionEagerInitialization {
    private static DBConnectionEagerInitialization connection = new DBConnectionEagerInitialization();

    private DBConnectionEagerInitialization(){}

    public static DBConnectionEagerInitialization getInstance(){
        return connection;
    }
}
