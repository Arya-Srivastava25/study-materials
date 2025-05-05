package MultiThreading;

class MultiThreadingClass extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
//        try {
//            System.out.println(Thread.currentThread().getId());
//        }
//        catch (Exception ex){
//            System.out.println("Exception");
//        }
    }
}