import java.util.Scanner;

public class throwsdemo {
	public static void demo()throws Exception
	{
		Scanner s=new Scanner(System.in);
		int x;
		
		System.out.println("Enter x:");
		x=s.nextInt();
		if(x>0)
		{
			System.out.println("Squre of "+x+" is:"+(x*x));
		}
		else
		{
			throw new Exception("Please enter positive value");
			
		}
	}

	public static void main(String[] args) {
		try 
		{
			demo();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("End code");
		}

	}

}
