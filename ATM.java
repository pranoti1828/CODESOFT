import java.util.Scanner;

// Bank Account class
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful! Current Balance:" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal Successful! Current Balance:" + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance:"+ balance);
    }
}

// ATM Interface class
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample bank account
        BankAccount account = new BankAccount("123456", "Pranoti Mokashi", 5000.0);

        while(true) {
            System.out.println("\n------ ATM Menu ------");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
    }
}
