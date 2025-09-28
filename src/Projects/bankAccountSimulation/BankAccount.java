package Projects.bankAccountSimulation;

public class BankAccount {
    private final long accountNumber=1234567890;
    private double balance=10000;
    private final int pin=123456;

    public int getPin() {
        return pin;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withDraw(double amount){
        this.balance-=amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
