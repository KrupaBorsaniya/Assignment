import java.util.Scanner;

public class ladderif {

	public static void main(String[] args) {
	int s1,s2,s3,total,rollno;
	double per;
	String name;
	
	System.out.println("Enter Roll No:");
	Scanner s=new Scanner(System.in);
	rollno=s.nextInt();
	System.out.println("Enter Name:");
	name=s.next();
	System.out.println("Enter s1:");
	s1=s.nextInt();
	System.out.println("Enter s2:");
	s2=s.nextInt();
	System.out.println("Enter s3:");
	s3=s.nextInt();
	total=s1+s2+s3;
	System.out.println("Total:"+total);
	per=total/3;
	System.out.println("Per:"+per);
	if(per>=70)
	{
		System.out.println("first class");
	}
	else if(per>=60)
	{
		System.out.println("Second class");	
	}
	else if(per>=50)
	{
		System.out.println("Third class");
	}
	else if(per>=40)
	{
		System.out.println("Pass class");
	}else 
	{
		System.out.println("Fail");
	}
	}

}
