class box
{
	double width;double height;
	double depth;
	box()
	{
		System.out.println("Default Constructor called");
		width=4;
		height=5;
		depth=6;
	}
	box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor called");
		width=w;
		height=h;
		depth=d;
	}
	box(box b)
	{
		System.out.println("Copy Constructor called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume:"+(width*height*depth));
	}
}
public class Constructordemo {
	

	public static void main(String[] args) {
		box s=new box();
		s.volume();
		
		box s1=new box(1,2,3);
		s1.volume();
		
		box s2=new box(s);
		s2.volume();

	}

}
