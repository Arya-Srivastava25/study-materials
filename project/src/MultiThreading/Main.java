package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        MultiThreadingClass multiThreading = new MultiThreadingClass();
        multiThreading.start();

        MultiThreadingClass multiThreading1 = new MultiThreadingClass();
//        multiThreading1.setDaemon(true);
        multiThreading1.start();


        System.out.println(multiThreading1.isDaemon());

//        MultiThreadingClass multiThreading2 = new MultiThreadingClass();
//        multiThreading2.run();


        RunnableClass runnableClass = new RunnableClass();
        runnableClass.run();

        RunnableClass runnableClass1 = new RunnableClass();
        runnableClass1.run();


        ExecutorService executorService = Executors.newFixedThreadPool(3);





    }
}
