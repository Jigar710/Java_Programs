//wap for sum of two arrays
import java.util.*;
class demo
{
	public static void main(String ar[])
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the data");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j] = sc.nextInt();
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.print("\nOutput\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}