class this1
{
	this1()
	{
		System.out.println("constructor called");
	}
	this1(int a)
	{
		this();
		System.out.println(a);
	}
}
public class thisdemo {

	public static void main(String[] args) {
		this1 t=new this1(100);

	}

}
