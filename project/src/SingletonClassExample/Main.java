package SingletonClassExample;

public class Main {
    public static void main(String[] args) {

        //Eager Initialization of Singleton class
        DBConnectionEagerInitialization dbConnectionEagerInitialization1 = DBConnectionEagerInitialization.getInstance();
        DBConnectionEagerInitialization dbConnectionEagerInitialization2 = DBConnectionEagerInitialization.getInstance();

        System.out.println(dbConnectionEagerInitialization1.hashCode());
        System.out.println(dbConnectionEagerInitialization2.hashCode());

        //Lazy Initialization of Singleton Class

        DBConnectionLazyInitialization dbConnectionLazyInitialization = DBConnectionLazyInitialization.getInstance();

        //Synchronized way of creating Singleton Class

        DBConnectionSynchronizedMethod dbConnectionSynchronizedMethod = DBConnectionSynchronizedMethod.getInstance();

        //Double-checked locking way of creating Singleton Class

        DBConnectionDoubleCheckedLocking dbConnectionDoubleCheckedLocking = DBConnectionDoubleCheckedLocking.getInstance();

        //Bill Pugh Solution of creating Singleton Class

        DBConnectionBillPughSolution dbConnectionBillPughSolution = DBConnectionBillPughSolution.getInstance();

        //Enum way of creating Singleton Class

        DBConnectionEnum dbConnectionEnum1 = DBConnectionEnum.INSTANCE;
        DBConnectionEnum dbConnectionEnum2 = DBConnectionEnum.INSTANCE;
        System.out.println(dbConnectionEnum1.hashCode());
        System.out.println(dbConnectionEnum2.hashCode());
    }
}
