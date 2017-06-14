package com.bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guapito on 6/14/2017.
 */
public class SavingsAccountTest {
    @Test
    public void deposit() throws Exception {
        SavingsAccount account = new SavingsAccount("account", 10.00, 0.25);
        account.deposit(5.00);
        assertEquals(15.00, account.getBalance(), 0);
    }

    @Test
    public void withdraw() throws Exception {
        SavingsAccount account = new SavingsAccount("account", 10.00, 0.25);
        account.withdraw(5.00);
        assertEquals(5.00, account.getBalance(), 0);
    }

}