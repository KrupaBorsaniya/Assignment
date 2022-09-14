package p1;

public class protection {

	int n=10;
	public int npub=20;
	private int npr=30;
	protected int npro=40;
	
	public protection()
	{
		System.out.println("protection constructor");
		System.out.println(n);
		System.out.println(npub);
		System.out.println(npr);
		System.out.println(npro);
	}
}
