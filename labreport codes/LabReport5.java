// wap to demonstrate method overriding
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }
}

public class LabReport5 {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Using `Animal` reference type here to demonstrate polymorphism 
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: "Dog barks"
        animal2.makeSound(); // Output: "Cat meows"

        Dog dog = (Dog) animal1;
        Cat cat = (Cat) animal2;
        dog.fetch(); // Output: "Dog fetches a ball"
        cat.scratch(); // Output: "Cat scratches"
    }
}

