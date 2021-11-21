package com.company;

public class StandardAccount implements IAccount {
    private double balance;
    private int accountNumber;
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        if (creditLimit > 0) {
            this.creditLimit = 0;
        } else {
            this.creditLimit = creditLimit;
        }
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public double Withdraw(double amount) {
        double totalFunds = this.balance - this.creditLimit;
        if (amount <= totalFunds) {
            this.balance = this.balance - amount;
            return amount;
        }

        this.balance = 0;
        return totalFunds;
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
