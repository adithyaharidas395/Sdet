package Questions;

public class Account {
	private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance =balance + amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance =balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void calculateInterest() {
        balance =balance + (balance * interestRate);
    }

}
