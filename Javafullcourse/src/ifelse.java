import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Java progaram is run ok");
		}
		else 
		{
			System.out.println("There is some error in progarm");
		}

	}

}
