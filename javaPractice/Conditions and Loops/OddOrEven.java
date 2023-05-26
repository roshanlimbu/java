import java.util.Scanner;
public class OddOrEven{
  public static void main(String[]args){
    Scanner number= new Scanner(System.in);
    // int num1 = 5; 
    System.out.println("Enter the number.");
    int num1= number.nextInt();
    if(num1/2==0){
      System.out.println("The number is even. ");
    } else{
      System.out.println("The number is odd. ");
      
    }
  }
}
