import java.util.Scanner;

class Bank
{
	private double bal=5000;
	private int pwd;
	public void deposite(double money)
	{
		System.out.print("Enter Password:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal+money;
			System.out.println("Deposited money: "+money);
			System.err.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
	public void withdraw(double money)
	{
		System.out.print("Enter Password:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal-money;
			System.out.println("Withdraw money: "+money);
			System.err.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
	public void checkbal()
	{
		System.out.print("Enter Password:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.err.println("Total Balance:"+bal);
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
}
public class encapsulationdemo {

	public static void main(String[] args) {
	Bank b=new Bank();	
	int ch;
	System.out.println("1.Deposite");
	System.out.println("2.Withdraw");
	System.out.println("3.check balance");
	System.out.print("Enter your choice:");
	Scanner s1=new Scanner(System.in);
	ch=s1.nextInt();
	switch(ch)
	{
	case 1:b.deposite(2000);
	break;
	case 2:b.withdraw(3000);
	break;
	case 3:b.checkbal();
	break;
	default:System.out.println("Invalid choice");
	
	}
	}

}
