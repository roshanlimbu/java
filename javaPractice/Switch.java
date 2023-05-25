import java.util.Scanner;
public class Switch {
  public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    System.out.println("Enter the number between 0-7. ");
    int NumInp = num.nextInt();
    // System.out.println("The number is "+ NumInp);
    if(NumInp>7){
    System.out.println("Invalid number");
    } else{
      switch (NumInp) {
        case 1:
          System.out.println("Sunday");
          break;
        case 2:
          System.out.println("Monday");
          break;
        case 3:
          System.out.println("Tuesday");
          break;
        case 4:
          System.out.println("Wednesday");
          break;
        case 5:
          System.out.println("Thursday");
          break;
        case 6:
          System.out.println("Friday");
          break;
        case 7:
          System.out.println("Saturday");
          break;
        default:
          System.out.println("Invalid Data.");
          break;
      }
    }
  }
}
