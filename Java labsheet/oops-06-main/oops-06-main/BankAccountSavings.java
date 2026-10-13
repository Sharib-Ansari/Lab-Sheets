class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed");
            System.out.println("Minimum balance of 100 is required");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class BankAccountSavings {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);
        account.withdraw(300);

        System.out.println("Final Balance = " + account.balance);
    }
}