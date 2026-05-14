package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1, "Test User", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(2, "Test User", 1000.0);
        account.withdraw(400.0);
        assertEquals(600.0, account.getBalance());
    }
}