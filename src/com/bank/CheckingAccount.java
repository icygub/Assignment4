package com.bank;

/**
 * Created by Guapito on 6/14/2017.
 */
public class CheckingAccount extends BankAccount {

    private int lastCheckNum;

    public CheckingAccount(String accountName, double balance, int lastCheckNum) {
        super(accountName, balance);
        this.lastCheckNum = lastCheckNum;
    }



}