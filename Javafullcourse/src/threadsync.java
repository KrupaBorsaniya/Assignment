class call
{
	public void callback(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class caller implements Runnable
{

	Thread t;
	String msg;
	call c;
	public caller(String msg,call c)
	{
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
		
	}
	public void run() {
		synchronized(c)
		{
			c.callback(msg);
		}
		}
		
	}
	


public class threadsync {

	public static void main(String[] args) {
		call c=new call();
		caller c1=new caller("Hi",c);
		caller c2=new caller("Hello",c);
		caller c3=new caller("How are you",c);
		caller c4=new caller("How do you do",c);
	}

}
