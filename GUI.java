package Assessment;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.CompoundBorder;

public class GUI extends JFrame {


    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;

    private JTextField accDeposit;
    private JTextField accWithdraw;
    private JTextField acc1Transfer;
    private JTextField acc2Transfer;
    private JTextField depositInput;
    private JTextField withdrawInput;
    private JTextField transferAmount;
    private JLabel dAmount;
    private JLabel wAccount;
    private JLabel wAmount;
    private JLabel t1;
    private JLabel t2;
    private JLabel tAmount;
    private JButton exitBtn;
    private JButton showAllButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JButton clearBtn;
   LinkedList<Account> globalAccounts = new LinkedList<>();
   private JButton hideBtn;

    public GUI(LinkedList<Account> globalAccounts) {
        super("Banking System");
    	this.globalAccounts = globalAccounts;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1245, 771);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();

        // Populate JTable with model
        table = new JTable(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"First Name", "Last Name", "Account Number", "Balance"
        	}
        ));
        table.setBackground(SystemColor.menu);
        table.setBorder(new CompoundBorder());
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        scrollPane.setViewportView(table);

        // Create text fields and buttons for deposit, withdraw, and transfer
        JPanel bodyPanel = new JPanel();
        bodyPanel.setBackground(new Color(0, 128, 128));
        bodyPanel.setBorder(new CompoundBorder());
        
                accDeposit = new JTextField();
                accDeposit.setBounds(194, 22, 327, 34);
                accDeposit.setFont(new Font("Calibri", Font.BOLD, 14));
                accDeposit.setForeground(Color.BLACK);
                accDeposit.setColumns(10);

        depositInput = new JTextField();
        depositInput.setBounds(193, 73, 328, 37);
        depositInput.setFont(new Font("Calibri", Font.BOLD, 14));
        depositInput.setForeground(Color.BLACK);
        depositInput.setColumns(10);

        accWithdraw = new JTextField();
        accWithdraw.setBounds(194, 171, 327, 37);
        accWithdraw.setFont(new Font("Calibri", Font.BOLD, 14));
        accWithdraw.setForeground(Color.BLACK);
        accWithdraw.setColumns(10);

        withdrawInput = new JTextField();
        withdrawInput.setBounds(194, 218, 327, 37);
        withdrawInput.setFont(new Font("Calibri", Font.BOLD, 14));
        withdrawInput.setForeground(Color.BLACK);
        withdrawInput.setColumns(10);

        acc1Transfer = new JTextField();
        acc1Transfer.setBounds(194, 304, 327, 34);
        acc1Transfer.setFont(new Font("Calibri", Font.BOLD, 14));
        acc1Transfer.setForeground(Color.BLACK);
        acc1Transfer.setColumns(10);
        
                transferButton = new JButton("Transfer");
                transferButton.setBounds(279, 456, 157, 31);
                transferButton.setFont(new Font("Calibri", Font.BOLD, 14));
                transferButton.setForeground(Color.WHITE);
                transferButton.setBackground(Color.GRAY);
                transferButton.addActionListener(new HandlerClass());

        acc2Transfer = new JTextField();
        acc2Transfer.setBounds(194, 353, 327, 37);
        acc2Transfer.setFont(new Font("Calibri", Font.BOLD, 14));
        acc2Transfer.setForeground(Color.BLACK);
        acc2Transfer.setColumns(10);
        
        JLabel dAccount = new JLabel("Account Number :");
        dAccount.setBounds(10, 24, 120, 31);
        dAccount.setFont(new Font("Calibri", Font.BOLD, 14));
        dAccount.setForeground(Color.BLACK);
        
        dAmount = new JLabel("Amount to deposit :");
        dAmount.setBounds(10, 76, 136, 31);
        dAmount.setFont(new Font("Calibri", Font.BOLD, 14));
        dAmount.setForeground(Color.BLACK);
        
        wAccount = new JLabel("Account Number :");
        wAccount.setBounds(10, 160, 120, 27);
        wAccount.setFont(new Font("Calibri", Font.BOLD, 14));
        wAccount.setForeground(Color.BLACK);
        
        wAmount = new JLabel("Amount to withdraw:");
        wAmount.setBounds(10, 208, 136, 31);
        wAmount.setFont(new Font("Calibri", Font.BOLD, 14));
        wAmount.setForeground(Color.BLACK);
        
        t1 = new JLabel("Source Account :");
        t1.setBounds(0, 308, 120, 27);
        t1.setFont(new Font("Calibri", Font.BOLD, 14));
        t1.setForeground(Color.BLACK);
        
        t2 = new JLabel("Destination Account :");
        t2.setBounds(0, 356, 136, 31);
        t2.setFont(new Font("Calibri", Font.BOLD, 14));
        t2.setForeground(Color.BLACK);
        
        JPanel headingPanel = new JPanel();
        headingPanel.setBackground(new Color(0, 128, 128));
        headingPanel.setBorder(new CompoundBorder());
        
        JPanel customerPanel = new JPanel();
        customerPanel.setBackground(new Color(0, 128, 128));
        customerPanel.setBorder(new CompoundBorder());
        
        hideBtn = new JButton("Hide All Data");
        hideBtn.setForeground(Color.WHITE);
        hideBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        hideBtn.setBackground(Color.GRAY);
        hideBtn.addActionListener(new HandlerClass());
        
        JLabel lblCustomer = new JLabel("Customer Data");
        customerPanel.add(lblCustomer);
        lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblCustomer.setForeground(Color.WHITE);
        lblCustomer.setBackground(Color.WHITE);
        
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(194, 549, 327, 31);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setFont(new Font("Calibri", Font.BOLD, 14));
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(new HandlerClass());
        bodyPanel.setLayout(null);
        bodyPanel.add(clearBtn);
        bodyPanel.add(transferButton);
        bodyPanel.add(dAccount);
        bodyPanel.add(accDeposit);
        bodyPanel.add(wAccount);
        bodyPanel.add(accWithdraw);
        bodyPanel.add(t1);
        bodyPanel.add(acc1Transfer);
        bodyPanel.add(t2);
        bodyPanel.add(wAmount);
        bodyPanel.add(dAmount);
        bodyPanel.add(withdrawInput);
        bodyPanel.add(acc2Transfer);
        bodyPanel.add(depositInput);

        
        JLabel headingTitle = new JLabel("Banking System");
        headingTitle.setForeground(Color.WHITE);
        headingTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
        headingPanel.add(headingTitle);
        
                transferAmount = new JTextField();
                transferAmount.setBounds(194, 409, 327, 37);
                bodyPanel.add(transferAmount);
                transferAmount.setFont(new Font("Calibri", Font.BOLD, 14));
                transferAmount.setForeground(Color.BLACK);
                transferAmount.setColumns(10);
                
                tAmount = new JLabel("Amount to transfer:");
                tAmount.setBounds(-6, 412, 136, 31);
                bodyPanel.add(tAmount);
                tAmount.setFont(new Font("Calibri", Font.BOLD, 14));
                tAmount.setForeground(Color.BLACK);
                
                exitBtn = new JButton("Exit");
                exitBtn.setBounds(194, 508, 327, 31);
                bodyPanel.add(exitBtn);
                exitBtn.setForeground(Color.WHITE);
                exitBtn.setFont(new Font("Calibri", Font.BOLD, 14));
                exitBtn.setBackground(Color.GRAY);
                
                        depositButton = new JButton("Deposit");
                        depositButton.setBounds(287, 120, 149, 31);
                        bodyPanel.add(depositButton);
                        depositButton.setFont(new Font("Calibri", Font.BOLD, 14));
                        depositButton.setForeground(Color.WHITE);
                        depositButton.setBackground(Color.GRAY);
                        
                                withdrawButton = new JButton("Withdraw");
                                withdrawButton.setBounds(287, 263, 149, 31);
                                bodyPanel.add(withdrawButton);
                                withdrawButton.setFont(new Font("Calibri", Font.BOLD, 14));
                                withdrawButton.setForeground(Color.WHITE);
                                withdrawButton.setBackground(Color.GRAY);
                                        
                                                // Button to show all data
                                                showAllButton = new JButton("Show All Data");
                                                showAllButton.setForeground(Color.WHITE);
                                                showAllButton.setFont(new Font("Tahoma", Font.BOLD, 14));
                                                showAllButton.setBackground(Color.GRAY);
                                                GroupLayout gl_contentPane = new GroupLayout(contentPane);
                                                gl_contentPane.setHorizontalGroup(
                                                	gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(gl_contentPane.createSequentialGroup()
                                                			.addGap(10)
                                                			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                				.addGroup(gl_contentPane.createSequentialGroup()
                                                					.addComponent(headingPanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                                                					.addGap(10)
                                                					.addComponent(customerPanel, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                                                				.addGroup(gl_contentPane.createSequentialGroup()
                                                					.addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                                                					.addGap(10)
                                                					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                                                				.addGroup(gl_contentPane.createSequentialGroup()
                                                					.addComponent(showAllButton, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                                                					.addGap(10)
                                                					.addComponent(hideBtn, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))))
                                                );
                                                gl_contentPane.setVerticalGroup(
                                                	gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(gl_contentPane.createSequentialGroup()
                                                			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(headingPanel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                                				.addComponent(customerPanel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                                                			.addGap(6)
                                                			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(bodyPanel, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
                                                				.addGroup(gl_contentPane.createSequentialGroup()
                                                					.addGap(2)
                                                					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)))
                                                			.addGap(47)
                                                			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(showAllButton)
                                                				.addComponent(hideBtn)))
                                                );
                                                contentPane.setLayout(gl_contentPane);
                                        showAllButton.addActionListener(new HandlerClass());
                                withdrawButton.addActionListener(new HandlerClass());
                        depositButton.addActionListener(new HandlerClass());
                exitBtn.addActionListener(new HandlerClass());
        

    }

    private class HandlerClass implements ActionListener {
    	

      
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == showAllButton) {
                showAllData();
            	table.setVisible(true);

            } else if (e.getSource() == depositButton) {
            
                	try {
                		int accountNumber = Integer.parseInt(accDeposit.getText());
                	    int depositAmount = Integer.parseInt(depositInput.getText());
                	    boolean accountFound = false;
                	    Account account1 = null;
                	    for (Account account : globalAccounts) {
                	        if (account.getAccountNumber() == accountNumber) {
                	            account.deposit(depositAmount); 
                	            accountFound = true;
                	            account1 = account;
                	            break; 
                	        }
                	    }
                	    
                	    if (depositAmount <= 0) {
                     	    JOptionPane.showMessageDialog(null, "Insufficient amount ", "Error", JOptionPane.ERROR_MESSAGE);
                 	    }

                	    if (!accountFound) {
                	        JOptionPane.showMessageDialog(null, "Account not found!", "Error", JOptionPane.ERROR_MESSAGE);
                	    } else {
                	        showAllData();
                	        JOptionPane.showMessageDialog(null, "Deposit successfully from account number  " + account1.getAccountNumber(), "Success", JOptionPane.INFORMATION_MESSAGE);
                	    }
                	} catch (NumberFormatException ex) {
                	    JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                	}
         	    
            } else if (e.getSource() == withdrawButton) {
         	   
         	    	try {
         	    		 int accountNumber = Integer.parseInt(accWithdraw.getText());
                  	    int withdrawAmount = Integer.parseInt(withdrawInput.getText());
                	    boolean accountFound = false;
                	    Account account1 = null;

                	    for (Account account : globalAccounts) {
                	        if (account.getAccountNumber() == accountNumber) {
                	            if (account.getBalance() >= withdrawAmount) {
                	                account.withdraw(withdrawAmount); 
                	                accountFound = true;
                    	            account1 = account;

                	                break; 
                	            } else {
                	                JOptionPane.showMessageDialog(null, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE);
                	                return; 
                	            }
                	        }
                	    }
                	    
                	    if(withdrawAmount <= 0) {
                     	    JOptionPane.showMessageDialog(null, "Insufficient amount ", "Error", JOptionPane.ERROR_MESSAGE);
                	    }

                	    if (!accountFound) {
                	        JOptionPane.showMessageDialog(null, "Account not found!", "Error", JOptionPane.ERROR_MESSAGE);
                	    } else {
                	        showAllData();
                	        JOptionPane.showMessageDialog(null, "Withdrawal successfully from " +account1.getAccountNumber() , "Success", JOptionPane.INFORMATION_MESSAGE);
                	    }
                	} catch (NumberFormatException ex) {
                	    JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                	}
        
            } else if (e.getSource() == transferButton) {
         	    	try {
         	    		 int sourceAccountNumber = Integer.parseInt(acc1Transfer.getText());
                  	    int destinationAccountNumber = Integer.parseInt(acc2Transfer.getText());
                  	    int transferAmounts = Integer.parseInt(transferAmount.getText());
                	    Account sourceAccount = null;
                	    Account destinationAccount = null;
                	    for (Account account : globalAccounts) {
                	        if (account.getAccountNumber() == sourceAccountNumber) {
                	            sourceAccount = account;
                	        } else if (account.getAccountNumber() == destinationAccountNumber) {
                	            destinationAccount = account;
                	        }
                	    }
                	    
                	    if (transferAmounts <= 0) {
                     	    JOptionPane.showMessageDialog(null, "Insufficient amount ", "Error", JOptionPane.ERROR_MESSAGE);

                 	    }

                	    if (sourceAccount == null || destinationAccount == null) {
                	        JOptionPane.showMessageDialog(null, "One or both accounts not found!", "Error", JOptionPane.ERROR_MESSAGE);
                	        return;
                	    }

                	    if (sourceAccount.getBalance() < transferAmounts) {
                	        JOptionPane.showMessageDialog(null, "Insufficient balance for transfer!", "Error", JOptionPane.ERROR_MESSAGE);
                	        return;
                	    }

                	    sourceAccount.withdraw(transferAmounts);
                	    destinationAccount.deposit(transferAmounts);

                	    showAllData();
                	    JOptionPane.showMessageDialog(null, "Transfer successful from account number " + sourceAccount.getAccountNumber()+ " to account number " + destinationAccount.getAccountNumber(), "Success", JOptionPane.INFORMATION_MESSAGE);
                	} catch (NumberFormatException ex) {
                	    JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                	}
         	    

            }else if (e.getSource() == clearBtn) {
            	accDeposit.setText("");
            	depositInput.setText("");
            	accWithdraw.setText("");
            	withdrawInput.setText("");
            	acc1Transfer.setText("");
            	acc2Transfer.setText("");
            	transferAmount.setText("");

            }else if (e.getSource() == exitBtn) {
            	dispose();
            }else if (e.getSource() == hideBtn) {
            	table.setVisible(false);
            }
        }
    }

    private void showAllData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 

        for (Account account : globalAccounts) {
            model.addRow(new Object[]{account.getFirstName(), account.getLastName(), account.getAccountNumber(), account.getBalance()});
        }
    }
}
