public class LabReport17 {
  public static void main(String[] args) {
    // Creating threads 
    Thread thread1 = new MyThread("Thread 1");
    Thread thread2 = new MyThread("Thread 2");

    // Starting the thread here 
    thread1.start();
    thread2.start();
  }
}

class MyThread extends Thread {
  public MyThread(String name) {
    super(name);
  }

  public void run() {
    for (int i = 1; i <= 3; i++) {
      System.out.println(getName() + " is running - Count: " + i);

      try {
        // Sleep for a random duration to simulate some work
        Thread.sleep((long) (Math.random() * 1000));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(getName() + " finished.");
  }
}
