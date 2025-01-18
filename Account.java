package Assessment;

// Account class extends Customer class
public class Account extends Customer{
    private int balance; // Variable to store the account balance
    private int accountNumber; // Variable to store the account number
    
    // Constructor for Account class
    public Account(String firstName, String lastName, int account, int balance){
        // Call the constructor of the superclass (Customer)
        super(firstName, lastName);
        
        // Initialize instance variables
        this.balance = balance;
        this.accountNumber = account;
    }

    // Getter method for retrieving the account balance
    public int getBalance() {
        return balance;
    }

    // Getter method for retrieving the account number
    public int getAccountNumber() {
        return accountNumber;
    }
    
    // Method to deposit money into the account
    public void deposit(int amount) {
        balance += amount; // Add the deposited amount to the balance
    }
    
    // Method to withdraw money from the account
    public void withdraw(int amount) {
        balance -= amount; // Subtract the withdrawn amount from the balance
    }

}
