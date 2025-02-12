package com.bridgelabz.accessmodifiers.levelone;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    // deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


    public void displayAccountDetails() {
        System.out.println("\nBank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;


    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);//no need of super as deposite is not a method in saving account class
        System.out.println("Interest of " + interest + " applied.");
    }


    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankManagement {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("123456", "mayank", 1000.0);
        acc1.displayAccountDetails();

        // Depositing and withdrawing money
        acc1.deposit(50000.0);
        acc1.withdraw(300.0);
        System.out.println("Updated Balance: " + acc1.getBalance());

        // Creating a savings account
        SavingsAccount savingsAcc = new SavingsAccount("789012", "Arnav", 2000.0, 5.0);
        savingsAcc.displayAccountDetails();

        // Applying interest and displaying updated details
        savingsAcc.applyInterest();
        savingsAcc.displayAccountDetails();
    }
}
