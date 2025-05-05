package SingletonClassExample;

public class DBConnectionBillPughSolution {

    private DBConnectionBillPughSolution(){}
    private static class DBConnection{
        private static final DBConnectionBillPughSolution INSTANCE = new DBConnectionBillPughSolution();
    }

    public static DBConnectionBillPughSolution getInstance(){
        return DBConnection.INSTANCE;
    }
}
