class printn
{
	public void print(int a,char b)
	{
		System.out.println(a+" "+b);
	}
	public void print(char a,int b)
	{
		System.out.println(a+" "+b);
	}
}
public class B36 {

	public static void main(String[] args) {
		printn n=new printn();
		n.print(10,'k');
		n.print('t',20);
	}

}
