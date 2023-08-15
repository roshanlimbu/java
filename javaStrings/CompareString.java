public class CompareString {
  public static void main(String [] args) {
    String s1 = "e";
    String s2 = "a";
    int out = s1.compareTo(s2);
    System.out.println(out);


    int out1 = s1.compareToIgnoreCase(s2);
    System.out.println(out1);
 } 
}
