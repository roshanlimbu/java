public class NullPointer {
  public static void main(String[] args) {
    String name = null;
    try {
     int strLen = name.length(); 
    } catch (NullPointerException e) {
      System.out.println("Caught a NullPointerException.");
    }
  }
}
