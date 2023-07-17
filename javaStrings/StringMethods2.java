public class StringMethods2 {
  public static void main(String[]args) {
    String s= "Eat an apple";
    int output = s.indexOf("apple");
    System.out.println(output);

    String s1 = "Learn Share Learn";
    int output1 = s1.indexOf("ea", 3);
    System.out.println(output1);

    String s2 = "Learn Share Learn";
    int output2 = s2.indexOf("a"); // returns 14
    System.out.println(output2);

    Boolean out = "Hello".equals("Hello");
    System.out.println(out);
    Boolean out2 = "Hello".equals("hello");
    System.out.println(out2);

    Boolean out3 = "Hello".equalsIgnoreCase("Hello");
    System.out.println(out3);
    Boolean out4= "Hello".equalsIgnoreCase("hello");
    System.out.println(out4);
  }  
}
