import java.util.Scanner;

public class LabReport2{
  public static void main(String [] args){
    // demonstrating inputs in java
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Enter the second number");
    int num2 = sc2.nextInt();

    sc1.close();
    sc2.close();
    // demonstrating operators
    
    System.out.println("Sum " +(num2 + num1) );
    System.out.println("Difference "+ (num1 - num2));
    System.out.println("Multiplication " + (num2 * num1 ));
    System.out.println("Divison " + (num1 / num2 ));
    System.out.println("Modulus " +(num1 % num2 ));
    System.out.println("Increment "+(++num1));
    System.out.println("Decrement " +(--num2));
  }
}

