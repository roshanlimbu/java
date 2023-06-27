class A {
  void msg() {
    System.out.println("Hello");
  }
}
class sigInherit extends A{
  public static void main(String args[]) {
    sigInherit obj = new sigInherit();   
    obj.msg();
  }
}
