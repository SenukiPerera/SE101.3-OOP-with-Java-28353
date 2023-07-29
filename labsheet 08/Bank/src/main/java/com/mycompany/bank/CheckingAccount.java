package com.mycompany.bank;
public class CheckingAccount extends BankAccount
{
    public CheckingAccount(int accountNumber, double balance)
    {
        super(accountNumber,balance);
    }
    @Override
    public double calculateInterest()
    {
        return getBalance()*0.02;
    }
}
