import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptiondemo {

	public static void main(String[] args) {
		System.out.println("start code");
		int a,b,c,index;
		Scanner s=new Scanner(System.in);
		try{
		System.out.print("Enter A:");
		a=s.nextInt();
		System.out.print("Enter B:");
		b=s.nextInt();
		c=a/b;
		System.out.println("Division:"+c);
		int arr[]= {1,2,3,4,5};
		System.out.print("Enter index number to print:");
		index=s.nextInt();
		System.out.println(arr[index]);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught:"+e);
		}catch(InputMismatchException e){
			System.out.println("Exception Caught:"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Caught:"+e);
		}
		System.out.println("End code");
		
	
	}

}
