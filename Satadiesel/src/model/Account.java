package model;

import model.exceptions.DomainExceptions;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount) throws DomainExceptions {
        if (balance<amount){
            throw new DomainExceptions("Not enough balance");
        }
        if (amount>withdrawLimit){
            throw new DomainExceptions("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }
}
