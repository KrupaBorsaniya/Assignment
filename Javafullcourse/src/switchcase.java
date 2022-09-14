import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A:");
		a=s.nextInt();
		System.out.println("Enter B:");
		b=s.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multification");
		System.out.println("4.Division");
		System.out.println("Enter Choice:");
		d=s.nextInt();
		switch(d)
		{
		case 1: 
			c=a+b;
			System.out.println("Addition:"+c);
			break;
		case 2: 
			c=a-b;
			System.out.println("Subraction:"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multification:"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division:"+c);
			break;
		case 5:
			System.out.println("Invalid Choice");
			break;
			
		}

	}

}
