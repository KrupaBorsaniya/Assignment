package com.Exception;

class ex1 
{
	void show()throws Exception
	{
		System.out.println("Krupa learn Java from tops techonologies");
	}
}
class ex2 extends ex1 
{
	void show()throws ArithmeticException
	{
		try
		{
			super.show();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rightnow we learn core Java from tops and after that we will learn advance java.");
	}
}
public class exceptionoverride {

	public static void main(String[] args) {
		ex2 e=new ex2();
		try
		{
			e.show();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}

	}

}
