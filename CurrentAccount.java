package Questions;

public class CurrentAccount extends Account {
	public CurrentAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

}
