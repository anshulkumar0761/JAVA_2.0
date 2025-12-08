public class laptop {
    String brand;
    int RAM;
    double price;

    public laptop(String brand, int RAM, double price) {
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Price: ₹" + price);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        laptop myLaptop = new laptop("Dell", 16, 75000.0);
        myLaptop.displayDetails();
        laptop myLaptop2 = new laptop("Asus", 16, 89000.0);
        myLaptop.displayDetails();

    }
}