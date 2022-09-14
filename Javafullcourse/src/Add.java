import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter A:");
		a=s.nextInt();
		System.out.print("Enter B:");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of two number is:"+c);

	}

}
