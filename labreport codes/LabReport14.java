// program to demonstrate encapsulation in java
class Student {
    // Private fields (attributes)
    private String name;
    private int age;

    // Public constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age input.");
        }
    }
}

public class LabReport14 {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Roshan", 21);

        // Access and modify the attributes using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Biren");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
