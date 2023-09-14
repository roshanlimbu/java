// program to demonstrate interfaces in java

// Define an interface
interface Animal {
    void eat(); // This method is implicitly public and abstract
}

// Implement the interface in a class
class Dog implements Animal {
    public void eat() {
        System.out.println("The dog is eating.");
    }

    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Implement the interface in another class
class Cat implements Animal {
    public void eat() {
        System.out.println("The cat is eating.");
    }

    void meow() {
        System.out.println("The cat is meowing.");
    }
}

public class LabReport13 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();

        // Call the eat method from the Animal interface
        obj1.eat();
        obj2.eat();

        // Call specific methods of Dog and Cat
        obj1.bark();
        obj2.meow();
    }
}
