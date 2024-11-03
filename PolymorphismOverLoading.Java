// Demonstration of Polymorphism in Java
// Polymorphism means "many forms" - achieving similar functionality in different ways.
// There are two types of polymorphism in Java:
// 1. Method Overloading (Compile-Time Polymorphism) - same method name but different parameters
// 2. Method Overriding (Run-Time Polymorphism) - same method name and parameters in a subclass

class Student {
    // Instance variables to store student's name and age
    String name;
    int age;

    // Method Overloading: printInfo() with different parameters

    // Method to print only the name
    void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method to print only the age
    void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    // Method to print both name and age
    void printInfo(String name, int age) {
        System.out.println("Name: " + name + " - Age: " + age);
    }
}

public class PolymorphismOverLoading {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student s1 = new Student();
        s1.name = "Rahul";  // Setting the name of the student
        s1.age = 21;         // Setting the age of the student

        // Calling printInfo() method with both name and age
        // This demonstrates method overloading
        s1.printInfo(s1.name, s1.age);
    }
}
