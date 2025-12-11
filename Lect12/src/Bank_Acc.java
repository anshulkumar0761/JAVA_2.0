import java.util.Random;

class BankAcc {
    private int totalBalance = 100;   // removed final so it can be updated

    public void getBalance() {
        System.out.println(totalBalance);
    }

    public void setBalance(int amount) {
        if (amount > 0) {
            totalBalance += amount;
        }
    }
}

class Atm {
    private int totalBalance = 1000000;

    public void getTotalB() {
        System.out.println(totalBalance);
    }

    public void withdraw(int amount) {
        if (amount > 0 && totalBalance >= amount) {
            totalBalance -= amount;
            System.out.println("Remaining Balance: " + totalBalance);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            totalBalance += amount;
            System.out.println("Updated Balance: " + totalBalance);
        }
    }
}

public class Bank_Acc {
    public static void main(String[] args) {
        // BankAcc demo
        BankAcc b1 = new BankAcc();
        b1.getBalance();
        b1.setBalance(5000);
        b1.getBalance();

        // ATM demo
        Atm atm1 = new Atm();
        atm1.getTotalB();
        atm1.withdraw(2000);
        atm1.deposit(400);

        // Random demo
        Random rand = new Random();
        double randomValue = rand.nextDouble(); // generates between 0.0 and 1.0
        System.out.println("Random value: " + randomValue);

        // Example math
        double result = 0.4 * 1000;
        System.out.println("0.4 * 1000 = " + result);

        final int a = 5; // constant example
        System.out.println("Final constant a = " + a);
    }
}