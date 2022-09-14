import java.util.Scanner;

public class whiledemo {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N:");
		n=s.nextInt();
		do
		{
			sum=sum+n;
			n--;
		}
		while(n>0);
		{
			System.out.println("Sum:"+sum);
			
		}

	}

}
