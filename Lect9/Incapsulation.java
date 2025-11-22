class Atm {
    private int TotalBalance = 10000;

    public void getBalance() {
        System.out.println(TotalBalance);
    }

    public void setBalance(int amount) {
        if (amount > 0) {
            TotalBalance += amount;
        }
    }
}

public class Incapsulation {
    public static void main(String[] args) {
        Atm s1 = new Atm();
        s1.getBalance();      // prints initial balance
        s1.setBalance(500);   // adds 500 to balance
        s1.getBalance();      // prints updated balance
    }
}