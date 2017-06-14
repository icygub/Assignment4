package com.bank;

/**
 * Created by Guapito on 6/14/2017.
 */
public abstract class BankAccount {

    String accountName;
    double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}