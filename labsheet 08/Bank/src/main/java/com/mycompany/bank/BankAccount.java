package com.mycompany.bank;
public abstract class BankAccount 
{
    private int accountNumber;
    private double balance;
    
    public BankAccount(int accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
     
    //Setter and Getter methods
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public int getAccountNumbrer()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    //create abstract method
    public abstract double calculateInterest();
}
