public class Wrapper {
    public static void main(String[] args) {
        // Using Integer wrapper class
        Integer intWrapper = Integer.valueOf(42); // Creating an Integer object
        int intValue = intWrapper.intValue(); // Converting back to int

        // Using Double wrapper class
        Double doubleWrapper = Double.valueOf(3.14159); // Creating a Double object
        double doubleValue = doubleWrapper.doubleValue(); // Converting back to double

        // Using Boolean wrapper class
        Boolean boolWrapper = Boolean.valueOf(true); // Creating a Boolean object
        boolean boolValue = boolWrapper.booleanValue(); // Converting back to boolean

        System.out.println("intWrapper: " + intWrapper);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("boolWrapper: " + boolWrapper);
    }
}
