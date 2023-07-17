public class BufferMethods {
  public static void main(String [] args) {
    // append methods
    StringBuffer sb = new StringBuffer("Hello");
    sb.append("javaScript") ;
    System.out.println(sb); // prints javaScript 

    //insert methods
    sb.insert(1, "kotlin") ;
    System.out.println(sb); // prints HkotlinellojavaScript

    // replace methods
    sb.replace(1, 7, "");
    System.out.println(sb); // prints HellojavaScript

    // delete Methods
    sb.delete(0, 5);
    System.out.println(sb); // prints javaScript

    // reverse Methods
    sb.reverse();
    System.out.println(sb); // prints tpircSavaj

    // capacity methods
    sb.reverse();
    sb.append("Hello");
    System.out.println(sb.capacity()); // prints 21
    
    // length methods
    System.out.println(sb.length()); // prints  15

  }
}
