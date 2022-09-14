import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable 
{
	int mar;
	String name;
	double per;
	
	public student(int mar,String name,double per)
	{
		this.mar=mar;
		this.name=name;
		this.per=per;

	}
	public String toString()
	{
		return "Student name: "+name+ " mar: "+mar+" per: "+per;
		
	}
}
public class serliaztiondemo {

	public static void main(String[] args) throws Exception{
		student s=new student(87,"Krupa",78);
		
		FileOutputStream fos=new FileOutputStream("Std");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("Object written done");
		
		FileInputStream fis=new FileInputStream("std");
		ObjectInputStream ois=new ObjectInputStream(fis);
		student s1=(student)ois.readObject();
		ois.close();
		System.out.println(s1);
	}

}
