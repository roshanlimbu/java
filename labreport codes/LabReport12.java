// program to demonstrate super keyword in java
// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    // Override the eat() method from the superclass
    void eat() {
        super.eat(); // Call the eat() method from the superclass
        System.out.println(name + " is eating dog food.");
    }
}

public class LabReport12 {
    public static void main(String[] args) {
        Dog obj = new Dog("Robot", "Bulldog");

        obj.displayInfo(); // Calls the displayInfo() method from Dog
        obj.eat();         // Calls the overridden eat() method in Dog
    }
}

