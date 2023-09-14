class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing.");
    }
}

public class LabReport11 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Call methods from both subclasses
        myDog.eat();  // Calls the eat() method from Animal (inherited)
        myDog.bark(); // Calls the bark() method from Dog
        System.out.println();

        myCat.eat();  // Calls the eat() method from Animal (inherited)
        myCat.meow(); // Calls the meow() method from Cat
    }
}
