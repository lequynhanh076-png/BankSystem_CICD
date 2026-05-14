package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private long id;
    private String owner;
    private double balance;

    public BankAccount(long id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        logger.info("Khởi tạo tài khoản: ID={}, Chủ sở hữu={}", id, owner);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            logger.error("Nạp tiền thất bại: Số tiền {} không hợp lệ", amount);
            return;
        }
        balance += amount;
        logger.info("Nạp tiền thành công: +{}, Số dư mới: {}", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            logger.warn("Rút tiền thất bại: Số dư không đủ (Yêu cầu: {}, Hiện có: {})", amount, balance);
            return;
        }
        balance -= amount;
        logger.info("Rút tiền thành công: -{}, Số dư còn lại: {}", amount, balance);
    }

    public double getBalance() {
        return balance;
    }
}