class A
{
int a;String b;
	A()
	{
		a=100;
	    b="Ani";
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class defaultcon {

	public static void main(String[] args) {
		A s=new A();
		s.disp();

	}

}
