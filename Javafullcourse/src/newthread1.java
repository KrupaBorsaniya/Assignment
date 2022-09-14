class nthread1 extends Thread
{
	public nthread1()
	{
		super("Thread");
		start();
	}
	public void run() {
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(this+"  : "+i);
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("New Thread Exiting");
		
	}
}
public class newthread1{
	public static void main(String[] args) {
		new nthread1();
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("New one");
		System.out.println(t);
		t.setPriority(1);
		System.out.println(t);
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+"  : "+i);
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}