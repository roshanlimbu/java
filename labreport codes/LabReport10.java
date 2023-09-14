class Animal{
  void eat (){
    System.out.println("Animal eats.");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Dog barks.");
  }
}
class Bulldog extends Dog{
  void play(){
    System.out.println("Bulldog plays ball.");
  }
}

public class LabReport10{
  public static void main(String[] args){
    Bulldog obj = new Bulldog();
    obj.eat();
    obj.bark();
    obj.play();
  }
}
