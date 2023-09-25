class MyThread extends Thread  { // when using extends u dont need line 10 
  public void run() {
    for(int i=1; i<=10; i++){
      System.out.println("User Thread Value: " + i);
    }
  }
}
public class MyThreads{
  public static void main(String [] args) {
    MyThread mt = new MyThread();
    // Thread t = new Thread (mt); // connected thread to obj mt
    mt.start();
  }
}
