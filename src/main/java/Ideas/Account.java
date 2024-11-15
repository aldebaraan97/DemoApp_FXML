package Ideas;

public class Account {
    private final int ID;
    private final String name;
    private double balance;

    public Account(int ID, String name, double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
}
