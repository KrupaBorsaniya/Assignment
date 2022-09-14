import java.util.Scanner;

class member
{
	String name;
	int age;
	double salary;
	String address,moblieno;
	Scanner s=new Scanner(System.in);
	
	public void info()
	{
		System.out.print("Enter Name:");
		name=s.next();
		System.out.print("Enter Mobile No:");
		moblieno=s.next();
		System.out.print("Enter Age :");
		age=s.nextInt();
		System.out.print("Enter salary:");
		salary=s.nextDouble();
		System.out.print("Enter Address:");
		address=s.next();
	}
	
}
class Employee extends member
{
	public void Speclization()
	{
		System.out.println("I am IT enginner and worked in Java dektop application deparement.");
	}
}
class Maneger extends member
{
	public void Deparement()
	{
		System.out.println("Employye Name: "+name);
		System.out.println("Employee Mobile No: "+moblieno);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Address :"+address);
	}
	public void prinsalary()
	{
		System.out.println("This emp salary is: "+salary);
	}
}
public class B39 {

	public static void main(String[] args) {
		Employee e=new Employee();
		Maneger m=new Maneger();
		
		m.info();
		e.Speclization();
		m.Deparement();
		m.prinsalary();
		

	}

}
