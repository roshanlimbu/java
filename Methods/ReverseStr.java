// Write a program in Java to reverse a String using a function.
import java.io.*;
public class ReverseStr{
  public static void main(String[]args){
    strRev();
  }
  public static void strRev(){
    char ch;
    String name = "Roshan", reversed ="";
    for(int i=1; i<=name.length; i++){
    ch = name.charAt(i);
    reversed = ch + reversed;
    }
    System.out.println(reversed);
  }
}
