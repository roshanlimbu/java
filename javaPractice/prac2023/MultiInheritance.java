class Animal {
  void eat(){
    System.out.println("Animal eats.");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Dog barks.");
  }
}

class Bulldog extends Dog{
  void sleeps(){
    System.out.println("Bulldog sleeps.");
  }
}
public class MultiInheritance {
  public static void main(String[] args) {
    Bulldog obj= new Bulldog();    
    obj.eat();
    obj.bark();
    obj.sleeps();
  }
}
