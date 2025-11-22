//Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
// 'Circle' and 'Rectangle'.
abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Test class
public class abstractAssi1 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        rect.area();

        Shape circle = new Circle(7);
        circle.area();
    }
}