// program to demonstrate MethodOverloading
public class MethodOverloading{
  static void adder(int x, int y){
    System.out.println(x+y);
  }
  static void adder(int x, int y, int z){
    System.out.println(x+y+z);
  }
  public static void main(String[]args){
    adder(2, 4);
    adder(2, 4, 5);
  }
}
