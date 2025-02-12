package com.bridgelabz.objectmodeling;

import java.util.ArrayList;
import java.util.List;


// Bank class (Associates with Customers)
class Bank {
    private String bankName;
    private List<Customer> customers; // Association (Bank HAS-A Customers)

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " has opened an account at " + bankName);
    }

    public void showCustomers() {
        System.out.println("\nCustomers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}

// Customer class (Has multiple accounts)
class Customer {
    private String name;
    private List<BankAccount> accounts; // Association (Customer HAS-A Accounts)

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nAccounts of " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("- Account: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// BankAccount class (Linked to both Bank and Customer)
class BankAccount {
    private String accountNumber;
    private double balance;
    private Bank bank; // Association with Bank

    public BankAccount(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Creating a Bank
        Bank sbiBank = new Bank("SBI Bank");

        // Creating Customers
        Customer mayank = new Customer("Mayank");
        Customer arnav = new Customer("Arnav");

        // Opening Accounts in the Bank
        sbiBank.openAccount(mayank);
        sbiBank.openAccount(arnav);

        // Creating Bank Accounts for Customers
        BankAccount acc1 = new BankAccount("ACC101", 5000.00, sbiBank);
        BankAccount acc2 = new BankAccount("ACC102", 7000.00, sbiBank);
        BankAccount acc3 = new BankAccount("ACC103", 3000.00, sbiBank);

        // Associating Accounts with Customers
        mayank.addAccount(acc1);
        mayank.addAccount(acc2);
        arnav.addAccount(acc3);

        // Displaying Customers and Their Balances
        sbiBank.showCustomers();
        mayank.viewBalance();
        arnav.viewBalance();
    }
}
