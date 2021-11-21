package com.company;

public class BasicAccount implements IAccount {
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= this.balance) {
            if (amount > withdrawalLimit) {
                this.balance = this.balance - withdrawalLimit;
                return withdrawalLimit;
            }
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
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
