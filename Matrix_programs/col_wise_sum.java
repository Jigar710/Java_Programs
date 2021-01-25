//wap for cols wise sum of elements of matrix
import java.util.*;
class demo
{
	public static void main(String ar[])
	{
		int a[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
				
		int sum[] = {0,0,0};
		
		System.out.print("\nOutput\n");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum[i] += a[j][i];
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("---------------------");
		for(int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+"\t");
		}
		
	}
}