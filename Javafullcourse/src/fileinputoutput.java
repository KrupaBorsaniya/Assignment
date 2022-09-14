import java.io.FileInputStream;
import java.io.FileOutputStream;



public class fileinputoutput {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Krupa");
		String s="This is demo file";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File done");
		
		FileInputStream fis=new FileInputStream("Krupa");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}
