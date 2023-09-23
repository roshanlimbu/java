interface Interface1{
  void methodA();
}
interface Interface2{
  void methodB();
}
class MyClass implements Interface1, Interface2{
  public void methodA(){
    System.out.println("methodA is called");
  }
  public void methodB(){
    System.out.println("methodB is called");
  }
}
public class MultiInheritanceImpl {
  public static void main(String[] args) {
    MyClass obj = new MyClass(); 

    obj.methodA();  
    obj.methodB();
  }
}
