package Assessment;

public class Transaction {
    // Method to transfer money from source account to destination account
    public void transfer(Account sourceAccount, Account destinationAccount, int amount) {
        // Subtracting amount from source account
        // Retrieve the current balance of the source account
        sourceAccount.getBalance();
        
        // Withdraw the specified amount from the source account
        sourceAccount.withdraw(amount);
        
        // Adding amount to destination account
        // Retrieve the current balance of the destination account
        destinationAccount.getBalance();
        
        // Deposit the specified amount into the destination account
        destinationAccount.deposit(amount);
    }
}

