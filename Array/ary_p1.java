import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter Number a["+i+"]: ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}