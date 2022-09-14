import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
	int y,a;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Year:");
	y=s.nextInt();
	a=y%2;
	if(a==0)
	{
		System.out.println("Leap year");
	}
	else
	{
		System.out.println("not leap year");
	}
	}

}
