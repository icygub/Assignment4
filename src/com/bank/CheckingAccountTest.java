package com.bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guapito on 6/14/2017.
 */
public class CheckingAccountTest {
    @Test
    public void deposit() throws Exception {
        CheckingAccount account = new CheckingAccount("account", 10.00, 1);
        account.deposit(5.00);
        assertEquals(15.00, account.getBalance(), 0);
    }

    @Test
    public void withdraw() throws Exception {
        CheckingAccount account = new CheckingAccount("account", 10.00, 1);
        account.withdraw(5.00);
        assertEquals(5.00, account.getBalance(), 0);
    }
}