// Demonstration of Polymorphism in Java using Method Overriding
// Polymorphism allows a single method to have different implementations in different classes.

class Animal {
    // Method to demonstrate the sound of an animal
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Dog class inherits Animal and overrides the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

// Cat class inherits Animal and overrides the sound() method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}

public class PolymorphismOverRiding {
    public static void main(String[] args) {
        // Creating instances of Animal, Dog, and Cat
        Animal myAnimal = new Animal(); // Animal reference to Animal object
        Animal myDog = new Dog();       // Animal reference to Dog object
        Animal myCat = new Cat();       // Animal reference to Cat object

        // Calling the sound() method on each object
        // Demonstrates method overriding at runtime
        myAnimal.sound();  // Calls Animal's sound method
        myDog.sound();     // Calls Dog's overridden sound method
        myCat.sound();     // Calls Cat's overridden sound method
    }
}
