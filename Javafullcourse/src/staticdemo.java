
public class staticdemo {
	static int a=10;
	static int b=34,
	c=a+b;
	static
	{
		System.out.println("static block called");
	}
	static void show()
	{
		System.out.println(c);
	}


	public static void main(String[] args) {
		staticdemo s=new staticdemo();
		s.show();

	}

}
