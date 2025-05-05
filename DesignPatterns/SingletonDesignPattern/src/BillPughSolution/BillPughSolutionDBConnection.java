package BillPughSolution;

public class BillPughSolutionDBConnection {

    private BillPughSolutionDBConnection(){}

    private static class DBConnection{
        private static final BillPughSolutionDBConnection INSTANCE = new BillPughSolutionDBConnection();
    }

    public static BillPughSolutionDBConnection getInstance(){
        return DBConnection.INSTANCE;
    }
}
