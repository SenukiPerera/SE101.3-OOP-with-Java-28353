package com.mycompany.bank;
public class Bank 
{
    public static void main(String[] args) 
    {
        //call the chlid class constructors
        SavingsAccount sa = new SavingsAccount(1234,20000000);
        CheckingAccount ca=new CheckingAccount(4567,1000000);
        
        System.out.println("Interest for Savings account: "+sa.calculateInterest());
        System.out.println("Interest for checking account: "+ca.calculateInterest());
    }
}
