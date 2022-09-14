
public class Genricdemo {
	
	public static <E>void printArray(E[]inputArray)
	{
		for(E e:inputArray)
		{
			System.out.print(" "+e);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer intArry[]= {1,2,3,4,5,6,7,8,9};
		Double doubleArray[]= {1.1,1.2,1.3,1.4,1.5};
		Character charArray[]= {'K','R','U','P','A'};
		
		printArray(intArry);
		printArray(doubleArray);
		printArray(charArray);
	}

}
