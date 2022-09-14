import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(10);
		s.add("Krupa");
		s.add(70);
		s.add('t');
		s.add(true);
		s.add(null);
		s.add(10.30);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
