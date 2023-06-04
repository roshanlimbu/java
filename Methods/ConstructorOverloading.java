// Program to demonstrate ConstructorOverloading
public class ConstructorOverloading{
   ConstructorOverloading(int x, int y){
    int result = x+y;
    System.out.println(result);
  }
   ConstructorOverloading(int x, int y, int z){
    int result = x+y +z;
    System.out.println(result);
  }
  public static void main(String[]args){
    ConstructorOverloading calc = new ConstructorOverloading(4, 5);
    ConstructorOverloading calc1 = new ConstructorOverloading(4, 5, 6);
  }
}
