package com.company;

/**
 * Created by Guapito on 6/14/2017.
 */
public class InvestmentAccount extends  BankAccount{

    private String accountRep;

    public InvestmentAccount(String accountName, double balance, String accountRep) {
        super(accountName, balance);
        this.accountRep = accountRep;
    }

    @Override
    public void withdraw(double amount) {
        double penalty = amount * 0.05;
        super.withdraw(amount + penalty);
    }
}
