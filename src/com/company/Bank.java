package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        boolean found = false;
        for (IAccount currAccount : this.accounts) {
            if (currAccount.GetAccountNumber() == account.GetAccountNumber()) {
                found = true;
            }
        }
        if (!found) {
            this.accounts.add(account);
        }
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).GetAccountNumber() == accountNumber) {
                if (this.accounts.get(i).GetCurrentBalance() >= 0) {
                    this.accounts.remove(i);
                } else {
                    System.out.println("You cant close this account due a debt");
                }
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return this.accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount currAccount : this.accounts) {
            if (currAccount.GetCurrentBalance() < 0) {
                accountsInDebt.add(currAccount);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWIthBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount currAccount : this.accounts) {
            if (currAccount.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(currAccount);
            }
        }
        return accountsWithBalance;
    }
}
