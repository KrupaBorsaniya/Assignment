package com.Exception;

public class checkingaccount 
{
	int acono;
	String cname;
	double balance=0.0;
	public checkingaccount(int acono)
	{
		this.acono=acono;
	}
	public void openaccount(String cname,double balance)
	{
		this.balance=balance;
		this.cname=cname;
		System.out.println("Hello "+this.cname+" your account is open with "+this.balance+"Rs.");
	}
	public void deposite(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Total balance: "+this.balance);
	}
	public void withdraw(double amount)throws Insufficientfund
	{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
		}
		else
		{
			double needs=amount-this.balance;
			throw new Insufficientfund(needs);
		}
	}
	public void checkbalance()
	{
		System.out.println("Current balance:"+this.balance);
	}
}
