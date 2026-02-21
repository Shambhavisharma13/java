public class Multithreading {
    public static void main(String[] args) {
      //object create
      MyThread t1=new MyThread();
      t1.start();
    }
}
class MyThread extends Thread{
     public void run(){
        System.out.println("Thread is Running!!!");
     }

}
