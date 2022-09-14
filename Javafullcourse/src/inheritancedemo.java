

class X
{
	int a=25,b=6,c;
	void add()
	{
		c=a+b;
		System.out.println("Addition :"+c);
	}
}
class Y extends X
{
	void sub()
	{
		c=a-b;
		System.out.println("subraction:"+c);
	}
}
class Z extends X
{
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication:"+c);
	}
}
public class inheritancedemo {

	public static void main(String[] args) {
		Y r=new Y();
		Z r1=new Z();
		r.add();
		r.sub();
		r1.mul();

	}

}
