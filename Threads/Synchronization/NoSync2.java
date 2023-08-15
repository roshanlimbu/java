class Table {
  void printTable(int num) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
      try {
        Thread.sleep(500); // Introducing a delay to simulate some work
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class MyThread1 extends Thread {
  Table table;

  MyThread1(Table table) {
    this.table = table;
  }

  public void run() {
    table.printTable(5);
  }
}

class MyThread1 extends Thread {
  Table table;

  MyThread1(Table table) {
    this.table = table;
  }

  public void run() {
    table.printTable(5);
  }
}
public class NoSync2() {
    public static void main(String[] args) {
       MyThread1  
    }
    
}
