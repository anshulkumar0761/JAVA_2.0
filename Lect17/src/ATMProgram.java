// BankAccount class with synchronized withdraw method
class BankAccount {
    private int balance = 10000; // initial balance

    // synchronized ensures only one thread can access withdraw at a time
    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " withdraw " + amount);

        if (balance >= amount) {
            System.out.println(user + " proceeding...");
            try {
                Thread.sleep(2000); // simulate ATM processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + user);
        }

        System.out.println("Remaining balance: " + balance);
        System.out.println("-----------------------------------");
    }
}

// ATMThread class representing a user
class ATMThread extends Thread {
    private BankAccount account;
    private String user;
    private int amount;

    public ATMThread(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(user, amount);
    }
}

// Main class
public class ATMProgram {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Multiple users trying to withdraw
        ATMThread user1 = new ATMThread(account, "User1", 5000);
        ATMThread user2 = new ATMThread(account, "User2", 7000);
        ATMThread user3 = new ATMThread(account, "User3", 3000);

        user1.start();
        user2.start();
        user3.start();
    }
}