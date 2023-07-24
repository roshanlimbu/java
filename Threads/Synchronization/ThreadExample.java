import jdk.internal.loader.Resource;

public class ThreadExample {
  public static void main(String[]args) {
    final String resource1 = "Roshan Limbu" ;
    final String resource2 = "INC";
    Thread t1 = new Thread(){
      public void run(){
        System.out.println("Thread 1: Locked resource 1 ");
        try{
          Thread.sleep(100);
        } catch (ExecPty e){};
        synchronized (resource2){
          System.out.println("Thread 1: Locked resource 2");
        }
      }
    }
    Thread t2 = new Thread(){
      public void run (){
        synchronized (resource2){
          System.out.println("Thread 2: locked resource 2");
          try{
            Thread.sleep(millis, 100);
          } catch (Exception e){};
          synchronized(resource1){
            System.out.println("Thread 2: Locked resource1");
          }
        }
      }
    } 
    t1.start();
    t2.start();
  }
}
