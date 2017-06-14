package com.company;

import static org.junit.Assert.*;

/**
 * Created by Guapito on 6/14/2017.
 */
public class InvestmentAccountTest {

    @org.junit.Test
    public void withdraw() throws Exception {
        InvestmentAccount account = new InvestmentAccount("account", 10.00, "yo");
        account.withdraw(5.0);
        assertEquals(4.75, account.getBalance(), 0);
    }

    @org.junit.Test
    public void deposit() throws Exception {
        InvestmentAccount account = new InvestmentAccount("account", 10.00, "yo");
        account.deposit(5.00);
        assertEquals(15.00, account.getBalance(), 0);
    }

}