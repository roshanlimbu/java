// wap to find the factorial of a number using recursion
public class LabReport8 {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
}
