public class Multithreading1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnable());
        t1.start();
    }
}

class MyRunnable implements Runnable{
           public void run(){
            System.out.println("Thread by runnable inetrface");
           }
}
//run()-thread logic
//start()-thread start
//sleep(ms)-pause  thread
//join()-wait for thread
//set priority()-set krna priority
//getpriority()-get krna priority

//normal-5
//min-10
//max-1
//schedular=at the time of execution kis thread which decide ki kon se thread ka run krna hai its depend on os of java