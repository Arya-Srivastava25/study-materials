package MultiThreading;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Current running thread : " + Thread.currentThread().getName());
    }
}
