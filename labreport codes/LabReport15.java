public class LabReport15 {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      int result = divideNumbers(numbers, 0);
      System.out.println("Result of division: " + result);
    } catch (ArithmeticException e) {
      System.out.println("An arithmetic error occurred: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("An array index error occurred: " + e.getMessage());
    } finally {
      System.out.println("Program execution completed.");
    }
  }

  public static int divideNumbers(int[] numbers, int divisor) {
    if (divisor == 0) {
      throw new ArithmeticException("Division by zero is not possible.");
    }

    return numbers[0] / divisor;
  }
}

