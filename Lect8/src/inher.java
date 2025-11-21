// Parent class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Child class 3
class Cow extends Animal {
    public void moo() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

// Main class
public class inher {
    public static void main(String[] args) {
        // Object of Dog
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method

        // Object of Cat
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat's own method

        // Object of Cow
        Cow cw = new Cow();
        cw.eat();  // inherited from Animal
        cw.moo();  // Cow's own method
    }
}