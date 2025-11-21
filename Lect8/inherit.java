class Parent {
    int x = 100;

    Parent() {
        System.out.println("Papa cons x = " + x);
    }
}

class Child extends Parent {
    int x = 200;

    Child() {
        System.out.println("Child this.x = " + this.x);
        System.out.println("Child super.x = " + super.x);
    }

    void show() {
        int x = 300;
        System.out.println("Local x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

public class inherit {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.show();
    }
}