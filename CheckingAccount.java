package com.hackercode.utility;

import UserDefinedException.InsufficientFundsException;

public class CheckingAccount {
    private double balance;
    private int number;
    private double amount;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance = +amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance)
            balance = amount;
        else{
        double needs = amount - balance;
        throw new InsufficientFundsException(needs);
    }
}
        public double getbalance () {
        return balance;
        }
            public int getNumber () {
                return number;
            }
        }
