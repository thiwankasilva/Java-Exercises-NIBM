package com.nibm;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private String branch;
    private double amount;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountName, String branch, double amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.branch = branch;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getBranch() {
        return branch;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", branch='" + branch + '\'' +
                ", amount=" + amount +
                '}';
    }
}
