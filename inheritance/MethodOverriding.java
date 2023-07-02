class Employee {
  public static int baseSalary = 10000;

  int salary() {
    return baseSalary;
  }
}

class Manager extends Employee {
  int salary() {
    return baseSalary + 50000;
  }
}

class Clerk extends Employee {
  int salary() {
    return baseSalary + 10000;
  }
}
// main class
class MethodOverriding {
   void printSalary(Employee e) {
    System.out.println(e.salary());
  }

  public static void main(String args[]) {
    // creating new obj for MethodOverriding class
    MethodOverriding obj = new MethodOverriding();
    Employee obj1 = new Manager();
    System.out.print("Manager's salary: ");
    obj.printSalary(obj1);
    Employee obj2 = new Clerk();
    System.out.print("Clerk's salary: ");
    obj.printSalary(obj2);
  }
}
