package entities;

public class ContaBancaria {
    private final int accountNumber;
    private String holder;
    private double balance;

    public ContaBancaria(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public ContaBancaria(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
        balance-=5;
    }

    public String toString() {
        return "Account "
                +accountNumber
                +", "
                +"Holder: "
                +holder
                +", "
                +"Balance: "
                +"$ "
                +String.format("%.2f",balance);
    }
}
