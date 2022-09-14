import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter A:");
		a=s.nextInt();
		System.out.print("Enter B:");
		b=s.nextInt();
		System.out.print("Enter C:");
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is bigger number");
			}
			else 
			{
				System.out.println("C is bigger number");
			}
		}
		else if(b>c)
		{
			System.out.println("B is bigger number");
		}
		else
		{
			System.out.println("C is bigger number");
		}
	
			
	}

}
