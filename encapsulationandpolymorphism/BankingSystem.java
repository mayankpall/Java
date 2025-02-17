package com.bridgelabz.encapsulationandpolymorphism;

// Abstract Class: BankAccount
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Enter a valid deposit amount.");
        } else {
            balance += amount;
            System.out.println(" Deposited " + amount + " to account " + accountNumber);
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn " + amount + " from account " + accountNumber);
        }
    }


    public double getBalance() {
        return balance;
    }

    abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("\n Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface: Loanable
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.7;
    private static final int MIN_BALANCE = 500;

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return (getBalance() * INTEREST_RATE) / 100;
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println(" Loan Approved at interest rate: " + INTEREST_RATE + "%");
        } else {
            System.out.println(" Loan Not Approved.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        if (getBalance() > MIN_BALANCE) {
            System.out.println(" Eligible for loan.");
            return true;
        }
        System.out.println(" Not eligible for loan.");
        return false;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    private static final double limit = 10000;

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return 0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Current Account");
        System.out.println("Overdraft Limit: " + limit);
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        //Savings Account
        BankAccount accountOne = new SavingsAccount(1001, "Arnav", 5000);
        accountOne.deposit(2000);
        accountOne.withdraw(3000);
        double interest = accountOne.calculateInterest();
        System.out.println(" Calculated Interest: " + interest);
        accountOne.displayDetails();

        //current Account
        BankAccount accountTwo = new CurrentAccount(1002, "Mayank", 15000);
        accountTwo.displayDetails();
    }
}
