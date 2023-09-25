import java.lang.*;
class ThreadExample extends Thread{
  public void run(){
    System.out.println("Inside run method.");
  }

  public static void main(String[]args){
    ThreadExample t1 = new ThreadExample();
    ThreadExample t2 = new ThreadExample();
    ThreadExample t3 = new ThreadExample();
    System.out.println("t1 thread priority: "+ t1.getPriority());
    System.out.println("t2 thread priority: "+ t2.getPriority());
    System.out.println("t3 thread priority: "+ t3.getPriority());

    t1.setPriority(2);
    t1.setPriority(5);
    t1.setPriority(8);

    System.out.println("t1 thread priority: " + t1.getPriority());
    System.out.println("t2 thread priority: " + t2.getPriority());
    System.out.println("t3 thread priority: " + t3.getPriority());


    System.out.println("Currently executing Thread: " + Thread.currentThread().getName());
    System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(10);
    System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
  }

}
