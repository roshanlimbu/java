public class NumberFormatException{
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "abc";

        try {
            int num1 = Integer.parseInt(str1); // Valid conversion
            System.out.println("Parsed number 1: " + num1);

            int num2 = Integer.parseInt(str2); // This will throw a NumberFormatException
            System.out.println("Parsed number 2: " + num2); // This line won't be reached
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " );
        }
    }
}

