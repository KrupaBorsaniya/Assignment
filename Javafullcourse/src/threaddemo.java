
public class threaddemo {
	public static void main(String[] args) {
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
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
