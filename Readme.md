# Polymorphism in Java

## Overview
This Java program demonstrates the concept of **Polymorphism**, which means "many forms." Polymorphism allows us to perform the same action in multiple ways. In Java, it is primarily achieved through:

1. **Method Overloading (Compile-Time Polymorphism)**: Having multiple methods with the same name but different parameters.
2. **Method Overriding (Run-Time Polymorphism)**: Having the same method name and parameters in a subclass to provide specific implementation.

This program specifically demonstrates **Method Overloading** by defining multiple versions of a `printInfo` method within the `Student` class.

## Code Structure
The program contains two classes:

1. **Student**: This class contains instance variables for `name` and `age` and demonstrates method overloading by providing three `printInfo` methods:
   - `printInfo(String name)`: Prints the name only.
   - `printInfo(int age)`: Prints the age only.
   - `printInfo(String name, int age)`: Prints both name and age.
   
2. **Polymorphism**: This is the main class where an instance of `Student` is created, and the overloaded `printInfo` method is called.

## How to Run the Program
1. Ensure you have [Java JDK installed](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Save the code to a file named `Polymorphism.java`.
3. Open a terminal or command prompt and navigate to the directory containing `Polymorphism.java`.
4. Compile the program using:
   ```bash
   javac Polymorphism.java
