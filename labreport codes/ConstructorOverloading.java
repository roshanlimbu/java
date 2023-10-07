// Program to demonstrate Constructor Overloading
public class ConstructorOverloading {
  ConstructorOverloading() {
    System.out.println("No-argument constructor");
  }

  ConstructorOverloading(int x, int y) {
    int result = x + y;
    System.out.println(result);
  }

  ConstructorOverloading(int x, int y, int z) {
    int result = x + y + z;
    System.out.println(result);
  }

  public static void main(String[] args) {
    ConstructorOverloading calc0 = new ConstructorOverloading();
    ConstructorOverloading calc1 = new ConstructorOverloading(4, 5);
    ConstructorOverloading calc2 = new ConstructorOverloading(4, 5, 6);
  }
}
