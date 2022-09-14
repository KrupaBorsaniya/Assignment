package p2;

import p1.protection;
public class Nonderived1 
{
	public Nonderived1()
	{
		protection p=new protection();
		System.out.println("Nonderived1 constructor");
		//System.out.println(p.n);
		System.out.println(p.npub);
		//System.out.println(p.npr);
		//System.out.println(p.npro);
	}
	
}
