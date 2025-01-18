package Assessment;

import java.awt.EventQueue;
import java.util.LinkedList;

public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//
//        LinkedList<Account> accounts = new LinkedList<>();
//
//        ReadAccounts readAccounts = new ReadAccounts("C:\\Users\\Acer\\eclipse-workspace\\Portfolio\\Accounts.csv");
//
//        LinkedList<String> firstNames = readAccounts.getFirstNames();
//
//        LinkedList<String> lastNames = readAccounts.getLastNames();
//
//        LinkedList<Integer> accountList = readAccounts.getAccounts();
//
//        LinkedList<Integer> balanceList = readAccounts.getBalances();
//        
//        // Populate the accounts LinkedList
//        for (int i = 0; i < accountList.size(); i++) {
//            String firstName = firstNames.get(i);
//            String lastName = lastNames.get(i);
//            Integer account = accountList.get(i);
//            Integer balance = balanceList.get(i);
//
//            // Create Account objects and add them to the accounts list
//            accounts.add(new Account(firstName, lastName, account, balance));
//        }
//           Transaction t = new Transaction();
//
//            Account acc1 = accounts.get(0);
//            acc1.deposit(100);
//            
//            acc1.withdraw(500);
//            
//            Account acc2 = accounts.get(1);
//            
//            acc2.deposit(10000);
//            
//            t.transfer(acc1, acc2, 4000);
//            
//            Account acc3 = accounts.get(2);
//            
//            Account acc4 = accounts.get(3);
//            
//            t.transfer(acc4, acc3, 50000);
//        
//        for (Account account : accounts) {
//            System.out.println("--------------------------------------------------");
//            System.out.println("Account: " + account.getAccountNumber());
//            System.out.println("Balance: " + account.getBalance());
//            System.out.println("Name: " + account.getFirstName() + " " + account.getLastName());
//            System.out.println("--------------------------------------------------");
//        }
//    }
	static String filePath = "Accounts.csv";
    static LinkedList<Account> globalAccounts = new LinkedList<>();
    
	public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ReadAccounts readAccounts = new ReadAccounts(filePath);
                LinkedList<String> firstNames = readAccounts.getFirstNames();
                LinkedList<String> lastNames = readAccounts.getLastNames();
                LinkedList<Integer> accountNumbers = readAccounts.getAccounts();
                LinkedList<Integer> balances = readAccounts.getBalances();

                for (int i = 0; i < accountNumbers.size(); i++) {
                    String firstName = firstNames.get(i);
                    String lastName = lastNames.get(i);
                    Integer accountNumber = accountNumbers.get(i);
                    Integer balance = balances.get(i);

                    globalAccounts.add(new Account(firstName, lastName, accountNumber, balance));
                }

                GUI frame = new GUI(globalAccounts);
                frame.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
