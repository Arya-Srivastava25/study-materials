package SynchronizedCounterExample;


public class CounterThread implements Runnable {

    Counter counter = new Counter();

    public CounterThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 100; i++)
            counter.increment();
    }
}
