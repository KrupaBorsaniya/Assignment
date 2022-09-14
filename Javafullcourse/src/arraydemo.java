import java.util.Scanner;

public class arraydemo {

	public static void main(String[] args) {
		int i,j,temp,sum=0;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Elemet:");
			a[i]=s.nextInt();
			sum=sum+a[i];
		
		}
		System.out.println("Array Element are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		System.out.println("Sum of array Element are:"+sum);
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
			
		}
		System.out.println("Array Element in Asceding order:");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
			
		}
		System.out.println("Array Element in Desceding order:");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		
	}

}
