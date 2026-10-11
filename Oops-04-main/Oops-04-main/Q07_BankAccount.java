// Question 7: Bank Account
// Concept: Encapsulation, Validation in Mutator Methods, Data Protection

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    // Private balance variable - cannot be accessed or modified directly outside class
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Controlled deposit method with input validation
    public void deposit(double amount) {
        System.out.println("Attempting to deposit: $" + amount);
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Successful! $" + amount + " added to account.");
        } else {
            System.out.println("Deposit Failed! Invalid deposit amount: $" + amount + " (Amount must be greater than 0).");
        }
        System.out.println("Current Balance: $" + this.balance);
        System.out.println("----------------------------------------------");
    }

    // Method to display account status
    public void displayAccountInfo() {
        System.out.println("--- BANK ACCOUNT DETAILS ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
        System.out.println("----------------------------");
    }
}

public class Q07_BankAccount {
    public static void main(String[] args) {
        // Main creates BankAccount object with initial balance
        BankAccount account = new BankAccount("ACC-100293", "Dr. Sunita Rao", 5000.00);

        account.displayAccountInfo();

        // Valid deposit operation
        account.deposit(1500.00);

        // Invalid deposit operation (negative amount - rejected by validation logic)
        account.deposit(-500.00);

        // Display final account status
        account.displayAccountInfo();
    }
}
