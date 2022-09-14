
import java.util.ArrayList;

public class arraylistdemo {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("Krupa");
	al.add(70);
	al.add('t');
	al.add(true);
	al.add(null);
	al.add(10.30);
	
	System.out.println(al);
	System.out.println(al.get(3));
	System.out.println(al.indexOf(true));
	System.out.println(al.lastIndexOf(10.30));
	System.out.println(al.remove(4));
	System.out.println(al.isEmpty());
	System.out.println(al);

	}

}
