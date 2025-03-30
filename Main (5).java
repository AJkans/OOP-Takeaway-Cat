// Abstract class Appliance
abstract class Appliance {
    // Abstract method to be implemented by subclasses
    abstract void turnOn();
}

// Subclass Fan implementing turnOn()
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("The fan is now spinning.");
    }
}

// Subclass TV implementing turnOn()
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("The TV is now displaying channels.");
    }
}

// Main class to test abstraction
public class Main {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        // Calling the abstract method
        myFan.turnOn();
        myTV.turnOn();
    }
}
