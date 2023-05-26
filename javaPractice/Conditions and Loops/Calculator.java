// Write a Java program to create a simple calculator using a switch case.
import java.util.Scanner;
public class Calculator{
  public static void main(String[]args){
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the first number");

    Scanner sc2 = new Scanner(System.in);
    System.out.println("Enter the second number");

    float num1 = sc1.nextInt(); 
    float num2 = sc2.nextInt(); 

    Scanner sc= new Scanner(System.in); // Takin the symbol for the calculation
    System.out.println("Enter the calculation you want to do. * / + -");
    char letter = sc.next().charAt(0);
    if (letter== '*' || letter == '/' || letter == '+' || letter == '-'){
    switch (letter) {
      case '*':
      System.out.println(num1*num2);
      break;
      case '/': 
      System.out.println(num1/num2);
      break;
      case '+': 
      System.out.println(num1+ num2);
      break;
      case '-': 
      System.out.println(num1-num2);
      break;
      default:
      System.out.println("Invalid option given!!");
        break;
      }
    } else{
      System.out.println("Invalid option given!!");
    }
  }
}
