import java.util.Scanner;
public class LabReport3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt() ;
    sc.close();
    
    // demonstrating conditions in java
    if(num==0){
      System.out.println("The number is zero.");
    } else if(num>0){
      // demonstrating loops
      for(int i=0; i<=5; i++){
        System.out.println("The number is positive.");
      }
    } else{
      System.out.println("The number is negative.");
    }

  }
}
