//ADM: 175851

// Parent class Animal
class Animal {
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    // Override the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    // Override the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow! Meow!");
    }
}

// Main class to demonstrate polymorphism
public class Method_Overiding {
    public static void main(String[] args) {
        // Create objects of Dog and Cat, but store them as Animal type
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Demonstrate polymorphism by calling makeSound() on both objects
        System.out.println("Calling makeSound() on Dog object:");
        myDog.makeSound();

        System.out.println("Calling makeSound() on Cat object:");
        myCat.makeSound();
    }
}