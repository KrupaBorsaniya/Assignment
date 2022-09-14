interface ifs1
{
	void show();
	
}
interface ifs2 extends ifs1
{
	void displ();
}
public class interfacedemo implements ifs2
{
	public void displ()
	{
		System.out.println("ifs2 called");
	}

	public static void main(String[] args) {
		interfacedemo i=new interfacedemo();
		i.show();
		i.displ();

	}

	@Override
	public void show() {
		System.out.println("if1 called");
		
	}

}
