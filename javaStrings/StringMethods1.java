public class StringMethods1{
  public static void main(String[] args) {
    String text = "HelloJava"; 
    System.out.println(text.length()); // returns 10 
    System.out.println(text.charAt(4)); // returns o 
    System.out.println(text.substring(3)); // returns 'loJava' 
    System.out.println(text.substring(3,6)); // returns 'loJ' 
    String s1 = "Hello";
    String s2 = "Java";
    int output = s1.compareTo(s2); //returns HelloJava
    System.out.println(output);

  }

}
