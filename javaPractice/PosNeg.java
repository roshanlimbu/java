import java.util.Scanner;
public class PosNeg{
  public static void main(String[]args){
    Scanner number=  new Scanner(System.in);
    System.out.println("Enter the number");
    int num = number.nextInt();
      if(num==0){
        System.out.println("The number is zero.");
      } else if(num<0){
        System.out.println("The number is negative.");
      } else{
        System.out.println("The number is positive.");
      }
    }  
  }
