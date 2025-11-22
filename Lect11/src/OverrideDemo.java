// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Animal();  // Parent object
        a.sound();                // Calls parent method

        Dog d = new Dog();        // Child object
        d.sound();                // Calls overridden method
    }
}