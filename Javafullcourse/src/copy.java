class C
{
	C()
	{
		System.out.println("Default constructor called");
	}
	C(int a,int b)
	{
		System.out.println("Parametrized constructor called");
	}
	C(C ref)
	{
	   System.out.println("Copy constructor called");
	}
}
public class copy {

	public static void main(String[] args) {
		C s=new C();
		C s1=new C(5,38);
		C s2=new C(s);
	}
}
