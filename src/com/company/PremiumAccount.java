package com.company;

public class PremiumAccount implements IAccount {
    private int accountNumber;
    private double balance;

    public PremiumAccount(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;

    }

    @Override
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public double Withdraw(double amount) {
        this.balance=this.balance-amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return this.balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}
