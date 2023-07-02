class Animal {
  void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("barking");
  }
}

class BabyDog extends Dog {
  void sleep() {
    System.out.println("sleeping");
  }
}

class MultInheritance {
  public static void main(String args[]) {
    BabyDog A = new BabyDog();
    A.sleep();
    A.bark();
    A.eat();
  }
}
