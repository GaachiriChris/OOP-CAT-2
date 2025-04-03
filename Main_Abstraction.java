//ADM:175851

// Abstract class Appliance
abstract class Appliance {
    // Abstract method turnOn() to be implemented by subclasses
    public abstract void turnOn();
}

// Subclass Fan extending Appliance
class Fan extends Appliance {
    // Implementing the abstract method turnOn()
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on and spinning.");
    }
}

// Subclass TV extending Appliance
class TV extends Appliance {
    // Implementing the abstract method turnOn()
    @Override
    public void turnOn() {
        System.out.println("TV is turned on and displaying a show.");
    }
}

// Main class to demonstrate abstraction
public class Main_Abstraction {
    public static void main(String[] args) {
        // Creating objects of Fan and TV
        Appliance fan = new Fan();
        Appliance tv = new TV();

        // Calling turnOn() on both objects
        fan.turnOn();
        tv.turnOn();
    }
}