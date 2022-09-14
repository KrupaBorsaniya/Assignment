import java.io.FileReader;
import java.io.FileWriter;

public class filereaderwriter {

	public static void main(String[] args) throws Exception
	{
		FileWriter fw=new FileWriter("Krupa1.txt");
		String s="This is file reder writer demo";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println(" File written done");
		
		FileReader fr=new FileReader("Krupa1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
