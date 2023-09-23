public class MethodOverloading {
  static void adder(int x, int y){
    System.out.println(x+y);
  }
  static void adder(int x, int y , int z){
    System.out.println(x+y);
  }
  public static void main(String[] args) {
    adder(3,5);
    adder(3,7, 9);
  }
}
