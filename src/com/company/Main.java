package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        BasicAccount basic1 = new BasicAccount(123, 100);
        StandardAccount stan1 = new StandardAccount(456, -300);
        PremiumAccount prem1 = new PremiumAccount(123);

        bank.OpenAccount(basic1);
        bank.OpenAccount(stan1);
        bank.OpenAccount(prem1);

        basic1.Deposit(500);
        System.out.println(basic1.Withdraw(200));
        System.out.println(basic1.GetCurrentBalance());
        System.out.println(bank.GetAllAccounts());
    }
}
