public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("ACC101", "Palak", 5000.0);

        account.deposit(2000.0);
        account.withdraw(1500.0);
        account.withdraw(10000.0);

        account.displayAccount();
    }
}

class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        // Local variable stores withdrawal status.
        boolean success;

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            success = true;
        } else {
            success = false;
        }

        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}