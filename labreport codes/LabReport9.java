// Superclass
class Animal {
    void eat() {
        System.out.println("The animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class LabReport9 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();
        myDog.bark();
    }
}
