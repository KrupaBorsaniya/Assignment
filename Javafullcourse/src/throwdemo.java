import java.util.Scanner;

public class throwdemo {
	public static void demo()
	{
		Scanner s=new Scanner(System.in);
		int x;
		try {
			System.out.println("Enter X:");
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
			catch(Exception e)
			{
				System.out.println("Exception caught:"+e);
				demo();
				
			}
	
	}

	public static void main(String[] args) {
		demo();
	

	}

}
