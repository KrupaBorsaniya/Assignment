class parent
{
	public void parent1()
	{
		System.out.println("This is parent class");
	}
}
class sub extends parent
{
	public void sub1()
	{
		System.out.println("This is child class");
	}
}
public class B38 {

	public static void main(String[] args) {
		parent p=new parent();
		sub s=new sub();
		
		s.parent1();
		s.sub1();
		
		p.parent1();
	

	}

}
