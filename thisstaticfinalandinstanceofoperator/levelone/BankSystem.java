package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class BankAccount {
    private static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using this
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    // Static method to get static total number of accounts
    public static void getTotalAccounts() {
        System.out.println("\nTotal Bank Accounts: " + totalAccounts);
    }


    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("\nBank Account Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid BankAccount object.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("mayank pal", "1234", 50000);
        BankAccount acc2 = new BankAccount("arnav", "4567", 7000);


        acc1.displayDetails();
        acc2.displayDetails();


        BankAccount.getTotalAccounts();


        System.out.println(" account 1 an instance of BankAccount? " + (acc1 instanceof BankAccount));
        System.out.println(" account 2 an instance of BankAccount? " + (acc2 instanceof BankAccount));
    }
}
