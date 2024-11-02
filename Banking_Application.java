import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Banking_Application {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.loadAccounts(); // Load existing accounts from file

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking Application Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name for the new account: ");
                    String name = scanner.next();
                    bank.createAcc(name);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNoDeposit = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    bank.deposit(accNoDeposit, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNoWithdraw = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    bank.withdraw(accNoWithdraw, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNoBalance = scanner.nextInt();
                    int balance = bank.balanceEnquiry(accNoBalance);
                    if (balance != -1) {
                        System.out.println("Balance for account " + accNoBalance + ": " + balance);
                    }
                    break;

                case 5:
                    bank.saveAccounts(); // Save accounts to file before exiting
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

interface RBI {
    void createAcc(String name);
    void withdraw(int acc, int amount);
    void deposit(int accno, int amount);
    int balanceEnquiry(int accno);
    void saveAccounts();
    void loadAccounts();
}

class Bank implements RBI {
    private HashMap<Integer, Integer> acc; // Account numbers and balances
    private HashMap<Integer, String> names; // Account numbers and names
    private int accNo = 42548; // Initial account number

    public Bank() {
        acc = new HashMap<>();
        names = new HashMap<>();
    }

    @Override
    public void createAcc(String name) {
        acc.put(accNo, 0); // Initialize balance to 0
        names.put(accNo, name); // Store account name
        System.out.println("New Account Created Successfully");
        System.out.println("ACC NO: " + accNo);
        System.out.println("NAME: " + name);
        accNo += 10; // Increment account number for the next account
    }

    @Override
    public void deposit(int accno, int amount) {
        if (acc.containsKey(accno)) {
            acc.put(accno, acc.get(accno) + amount); // Update balance
            System.out.println("Deposited Successfully");
        } else {
            System.out.println("Account does not exist.");
        }
    }

    @Override
    public int balanceEnquiry(int accno) {
        if (acc.containsKey(accno)) {
            return acc.get(accno); // Return current balance
        } else {
            System.out.println("Account does not exist.");
            return -1; // Indicate error
        }
    }

    @Override
    public void withdraw(int acc, int amount) {
        if (acc.containsKey(acc)) {
            if (acc.get(acc) >= amount) {
                acc.put(acc, acc.get(acc) - amount); // Deduct amount
                System.out.println("Withdrawal Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Account does not exist.");
        }
    }

    @Override
    public void saveAccounts() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt"))) {
            for (Integer accountNumber : acc.keySet()) {
                writer.write(accountNumber + "," + acc.get(accountNumber) + "," + names.get(accountNumber));
                writer.newLine();
            }
            System.out.println("Accounts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    @Override
    public void loadAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int accountNumber = Integer.parseInt(parts[0]);
                int balance = Integer.parseInt(parts[1]);
                String name = parts[2];

                acc.put(accountNumber, balance);
                names.put(accountNumber, name);
                accNo = Math.max(accNo, accountNumber + 10); // Update accNo for the next account
            }
            System.out.println("Accounts loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing accounts found, starting fresh.");
        } catch (IOException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
    }
}