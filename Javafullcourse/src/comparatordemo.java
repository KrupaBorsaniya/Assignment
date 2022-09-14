import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatordemo implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
{
	int value=0;
	if(e1.getSalary()>e2.getSalary())
	{
		value=-1;
	}
	else if(e1.getSalary()<e2.getSalary())
	{
		value=1;
	}
	else if(e1.getSalary()==e2.getSalary())
	{
		value=0;
	}
	return value;
}

	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
		
		Emp e1=new Emp();
		e1.setEmpno(1);
		e1.setName("Krupa");
		e1.setSalary(17000);
		
		Emp e2=new Emp();
		e2.setEmpno(2);
		e2.setName("Aniket");
		e2.setSalary(35000);
		
		Emp e3=new Emp();
		e3.setEmpno(3);
		e3.setName("Jainish");
		e3.setSalary(45000);
		
		Emp e4=new Emp();
		e4.setEmpno(4);
		e4.setName("Dalashukh");
		e4.setSalary(30000);
		
		Emp e5=new Emp();
		e5.setEmpno(5);
		e5.setName("Jayshree");
		e5.setSalary(12000);
		
		Emp e6=new Emp();
		e6.setEmpno(6);
		e6.setName("Ramesh");
		e6.setSalary(50000);
		
		Emp e7=new Emp();
		e7.setEmpno(7);
		e7.setName("Sarda");
		e7.setSalary(5000);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		
		Collections.sort(l, new comparatordemo());
		
		for(Emp e:l)
		{
			System.out.println("EMPNO :"+e.getEmpno());
			System.out.println("ENAME :"+e.getName());
			System.out.println("SALARY :"+e.getSalary());
		}
	}

	
	}


