package SynchronizedCounterExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

//        Thread thread1 = new Thread(new CounterThread(counter));
//
//        Thread thread2 = new Thread(new CounterThread(counter));
//
//        thread1.start();
//        thread2.start();

        Thread threadA = new Thread(() -> {
            for (int i = 0 ; i < 100; i++)
                counter.increment();
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0 ; i < 100; i++)
                counter.increment();
        });

        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

        System.out.println("Counter : " + counter.getCount());

    }

    /*
            1. Singleton
            2. Prototype
            3. Request
            4. Session
            5. Application
            6. WebSocket
     */
}
