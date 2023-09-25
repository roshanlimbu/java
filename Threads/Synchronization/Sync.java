class Table {
  // Method to print the multiplication table of a given number
  synchronized void printTable(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
      try {
        Thread.sleep(500); // Introducing a delay to simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
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

class MyThread2 extends Thread {
  Table table;

  MyThread2(Table table) {
    this.table = table;
  }

  public void run() {
    table.printTable(100);
  }
}

public class Sync {
  public static void main(String[] args) {
    Table obj = new Table();
    MyThread1 t1 = new MyThread1(obj);
    MyThread2 t2 = new MyThread2(obj);
    t1.start();
    t2.start();
  }
}

