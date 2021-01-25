import java.util.*;
class test
{
	public static void main(String arp[])
	{
		int a[][];
		int row,col;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Row : ");
		row=sc.nextInt();
		
		a=new int[row][];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter col for a["+i+"] : ");
			col=sc.nextInt();
			a[i]=new int[col];
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter Number : ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}






