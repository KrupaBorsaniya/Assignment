package com.Exception;

import java.util.Scanner;

public class Bankdemo {

	public static void main(String[] args) {
		double amount;
		checkingaccount c=new checkingaccount(101);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name of Customer:");
		String cname=s.next();
		System.out.print("Enter Intial balance to open account:");
		double balance=s.nextDouble();
		c.openaccount(cname,balance);
		
			System.out.println("1.Deposite");
			System.out.println("2.withdraw");
			System.out.println("3.check balance");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:System.out.print("Enter Deposite amount:");
				amount=s.nextDouble();
				c.deposite(amount);
				break;
			
			case 2:System.out.println("Enter withdraw amount:");
				amount=s.nextDouble();
				try
				{
					c.withdraw(amount);
				}
				catch(Insufficientfund e)
				{
					System.out.println("sorry you need another"+e.getamount()+"Rs.");
				}
				break;
			
			case 3:
			
				c.checkbalance();
				break;
			
			default:System.out.println("Invalid choice");
			
		}
		
		}
	}



