abstract class ipl1
{
	abstract void ipl();
}
class mumbai extends ipl1
{
	void ipl()
	{
		System.out.println("Mumbai Team:");
		System.out.println("Rohit sharama is captain");
	}
}
class DC extends ipl1
{
	void ipl()
	{
		System.out.println("DC Team:");
		System.out.println("Rushabh panth is captain");
	}
}
class GT extends ipl1
{
	void ipl()
	{
		System.out.println("GT Team:");
		System.out.println("Hardik pandya is captain");
	}
}
class KKR extends ipl1
{
	void ipl()
	{
		System.out.println("KKR Team:");
		System.out.println("Seyash aiyar is captain");
	}
}
class LSG extends ipl1
{
	void ipl()
	{
		System.out.println("LSG Team:");
		System.out.println("K L rahul is captain");
	}
}
public class ipl {

	public static void main(String[] args) {
		mumbai m=new mumbai();
		m.ipl();
		DC d=new DC();
		d.ipl();
		GT g=new GT();
		g.ipl();
		KKR k=new KKR();
		k.ipl();
		LSG l=new LSG();
		l.ipl();
		

	}

}
