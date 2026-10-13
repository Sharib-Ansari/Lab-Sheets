abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Savings Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance = balance - amount;
            System.out.println("Savings Account Withdrawal: " + amount);
        } else {
            System.out.println("Minimum balance of 100 required");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Current Account Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankAccountAbstract {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(500);

        savings.deposit(200);
        savings.withdraw(300);

        System.out.println(
            "Savings Account Balance = " + savings.balance
        );

        CurrentAccount current = new CurrentAccount(1000);

        current.deposit(500);
        current.withdraw(300);

        System.out.println(
            "Current Account Balance = " + current.balance
        );
    }
}