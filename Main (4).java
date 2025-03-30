// Method Overloading in MathOperations
class MathOperations {
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Base class with method overriding
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog overriding makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass Cat overriding makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class to test overloading and overriding
public class Main {
    public static void main(String[] args) {
        // Testing Method Overloading
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiplication of 2 and 3: " + mathOps.multiply(2, 3));
        System.out.println("Multiplication of 2, 3, and 4: " + mathOps.multiply(2, 3, 4));

        // Testing Method Overriding
        Animal myDog = new Dog(); // Polymorphism
        Animal myCat = new Cat(); // Polymorphism
        
        myDog.makeSound(); // Calls Dog's version
        myCat.makeSound(); // Calls Cat's version
    }
}
