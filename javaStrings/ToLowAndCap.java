public class ToLowAndCap {
  public static void main(String[] args) {
    String word1 = "Hello";
    String word2 = word1.toLowerCase();
    System.out.println(word2);

    // to upper case
    String word3 = "Hello";
    String word4 = word3.toUpperCase();
    System.out.println(word4);

    // trimming string
    String word5 = "Learn Share Learn";
    String word6 = word5.trim();
    System.out.println(word6);

    String word7 = "HelloJava";
    String word8 = word7.replace('J', 'L');
    System.out.println(word8);
  } 
}
