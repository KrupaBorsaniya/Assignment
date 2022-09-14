import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		int i,j;
		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				
				System.out.print("Row of array " +i+" coloum of array " + j+" :");
				a[i][j]=s.nextInt();
			}
		
		}


	}

}
