package com.company;

/**
 * Created by Guapito on 6/14/2017.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountName, double balance, double interestRate) {
        super(accountName, balance);
        this.interestRate = interestRate;
    }
}
