import BillPughSolution.BillPughSolutionDBConnection;
import DoubleCheckedLock.DoubleCheckedLockDBConnection;
import EagerInitialization.EagerInitializationDBConnection;
import EnumSolution.EnumSolutionDBConnection;
import LazyInitialization.LazyInitializationDBConnection;
import Synchronized.SynchronizedDBConnection;

public class Main {
    public static void main(String[] args) {

        EagerInitializationDBConnection eagerInitializationDBConnection1 = EagerInitializationDBConnection.getInstance();
        EagerInitializationDBConnection eagerInitializationDBConnection2 = EagerInitializationDBConnection.getInstance();

        System.out.println("Eager : " + eagerInitializationDBConnection1.equals(eagerInitializationDBConnection2));

        LazyInitializationDBConnection lazyInitializationDBConnection1 = LazyInitializationDBConnection.getInstance();
        LazyInitializationDBConnection lazyInitializationDBConnection2 = LazyInitializationDBConnection.getInstance();

        System.out.println("Lazy : " + lazyInitializationDBConnection1.equals(lazyInitializationDBConnection2));

        SynchronizedDBConnection synchronizedDBConnection1 = SynchronizedDBConnection.getInstance();
        SynchronizedDBConnection synchronizedDBConnection2 = SynchronizedDBConnection.getInstance();

        System.out.println("Synchronized : " + synchronizedDBConnection1.equals(synchronizedDBConnection2));

        DoubleCheckedLockDBConnection doubleCheckedLockDBConnection1 = DoubleCheckedLockDBConnection.getInstance();
        DoubleCheckedLockDBConnection doubleCheckedLockDBConnection2 = DoubleCheckedLockDBConnection.getInstance();

        System.out.println("Double Checked Lock : " + doubleCheckedLockDBConnection1.equals(doubleCheckedLockDBConnection2));

        BillPughSolutionDBConnection billPughSolutionDBConnection1 = BillPughSolutionDBConnection.getInstance();
        BillPughSolutionDBConnection billPughSolutionDBConnection2 = BillPughSolutionDBConnection.getInstance();

        System.out.println("Bill Pugh : " + billPughSolutionDBConnection1.equals(billPughSolutionDBConnection2));

        EnumSolutionDBConnection enumSolutionDBConnection1 = EnumSolutionDBConnection.INSTANCE;
        EnumSolutionDBConnection enumSolutionDBConnection2 = EnumSolutionDBConnection.INSTANCE;

        System.out.println("Enum : " + enumSolutionDBConnection1.equals(enumSolutionDBConnection2));

    }
}