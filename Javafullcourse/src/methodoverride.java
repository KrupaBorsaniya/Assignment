class r
{
	r()
	{
		System.out.println("a constructor called");
	}
	void show() 
	{
		System.out.println("a class method called");
	}
}
class s extends r
{
	s()
	{
		System.out.println("b constructor called");
	}
	void show() 
	{
		super.show();
		System.out.println("b class method called");
	}
}
class h extends s
{
	h()
	{
		System.out.println("c constructor called");
	}
	void show() 
	{
		super.show();
		System.out.println("c class method called");
	}
}
public class methodoverride {

	public static void main(String[] args) {
		h r=new h();
		r.show();

	}

}
