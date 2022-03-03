package com.company;

public class Bankaccount {
    private String accountHoldername;
    private boolean isActive;
    long accountnumber;
    double balance;

    public Bankaccount(String accountHoldername, boolean isActive, long accountnumber, double balance) {
        this.accountHoldername = accountHoldername;
        this.isActive = isActive;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
