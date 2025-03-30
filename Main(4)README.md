# Method Overloading and Overriding in Java

## Description
This Java program demonstrates **method overloading** and **method overriding**.  
- **Method Overloading** is shown in the `MathOperations` class with two `multiply()` methods.
- **Method Overriding** is implemented in the `Animal` class and its subclasses (`Dog` and `Cat`).

## Features
- Overloaded `multiply()` method:
  - `multiply(int a, int b)`: Multiplies two integers.
  - `multiply(int a, int b, int c)`: Multiplies three integers.
- Overridden `makeSound()` method:
  - `Animal` defines `makeSound()`.
  - `Dog` and `Cat` override `makeSound()`.
  - Demonstrates **polymorphism**.

## Usage
1. Save the code as `Main.java`.
2. Compile the program:
   ```sh
   javac Main.java
