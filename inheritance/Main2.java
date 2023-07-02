class Employee {
  public static int base = 10000;

  int salary() {
    return base;
  }
}

class Manager extends Employee {
  int salary() {
    return base + 20000;
  }
}

class Clerk extends Employee {
  int salary() {
    return base + 10000;
  }
}

class Main2 {
   void printSalary(Employee e) {
    System.out.println(e.salary());
  }

  public static void main(String args[]) {
    Main2 obj = new Main2();
    Employee obj1 = new Manager();
    System.out.print("Manager's salary: ");
    // printSalary(obj1);
    obj.printSalary(obj1);
    Employee obj2 = new Clerk();
    System.out.print("Clerk's salary: ");
    // printSalary(obj2);
    obj.printSalary(obj2);
  }
}
