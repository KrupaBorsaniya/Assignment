class final1
{
	final int a=10;
	final int b=20,
	c=a+b;
	
	final void displ()
	{
		System.out.println(c);
	}
}
public class finaldemo {

	public static void main(String[] args) {
		final1 f=new final1();
		f.displ();

	}

}
