import java.util.Scanner;
public class Java{
        public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        /*
        System.out.println("Hello");
        int num1=10;
        String name= "Roshan";
        Float float1= 3.14f;
        System.out.println("This is integer " + num1);
        System.out.println("This is string " +name);
        System.out.println("This is float " + float1);*/
        System.out.println("Enter the principal: ");
        int principal= sc.nextInt();
        System.out.println("Enter the time:  ");
        int time= sc.nextInt();
        System.out.println("Enter the rate of the interest: ");
        int rate= sc.nextInt();
        System.out.println("The simple interest is : "+ (principal * time * rate )/ 100);
    }
}
