import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> AccountsList = new ArrayList<>();

    public void createAccount(Scanner scanner) {
        System.out.println("Enter Account Name:");
        String accountName = scanner.nextLine();

        System.out.println("Enter Account ID:");
        String accountID = scanner.nextLine();

        System.out.println("Enter Initial Deposit Amount:");
        double initialDeposit = scanner.nextDouble();

        Account account = new Account(accountName, accountID, initialDeposit);
        addAccount(account);

        System.out.println("Account created successfully.");
    }

    public void seeAccountStatus(Scanner scanner) {
        System.out.println("Enter Account ID:");
        String accountID = scanner.nextLine();
        searchAccountStatus(accountID);
    }

    public void depositMoney(Scanner scanner) {
        System.out.println("Enter Account ID:");
        String accountID = scanner.nextLine();

        System.out.println("Enter Deposit Amount:");
        double depositAmount = scanner.nextDouble();

        Account account = findAccount(accountID);
        if (account != null) {
            depositMoneyInAccount(account, depositAmount);
            System.out.println("Deposit successful. New balance: " + account.BalanceStatus());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(Scanner scanner) {
        System.out.println("Enter Account ID:");
        String accountID = scanner.nextLine();

        System.out.println("Enter Withdraw Amount:");
        double withdrawAmount = scanner.nextDouble();

        Account account = findAccount(accountID);
        if (account != null) {
            if (account.BalanceStatus() >= withdrawAmount) {
                withdrawMoneyInAccount(account, withdrawAmount);
                System.out.println("Withdrawal successful. New balance: " + account.BalanceStatus());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void addAccount(Account account) {
        AccountsList.add(account);
    }

    public void searchAccountStatus(String accountID) {
        boolean found = false;
        for (Account account : AccountsList) {
            if (accountID.equals(account.getAccountID())) {
                found = true;
                System.out.println("Account Current Status:");
                System.out.println("Account Name: " + account.getAccountName());
                System.out.println("Account ID: " + account.getAccountID());
                System.out.println("Account Balance: " + account.BalanceStatus());
                break;
            }
        }
        if (!found) {
            System.out.println("Account with ID " + accountID + " not found.");
        }
    }

    public void depositMoneyInAccount(Account account, double depositAmount) {
        account.depositMoney(depositAmount);
    }

    public void withdrawMoneyInAccount(Account account, double withdrawAmount) {
        account.withdrawMoney(withdrawAmount);
    }

    public Account findAccount(String accountID) {
        for (Account account : AccountsList) {
            if (accountID.equals(account.getAccountID())) {
                return account;
            }
        }
        return null;
    }

    public void createAccount(String accountName, String accountID, double initialDeposit) {
    }
}
