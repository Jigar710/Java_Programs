//wap for row wise sum of elements of matrix
import java.util.*;
class demo
{
	public static void main(String ar[])
	{
		int a[][] = new int[3][3];

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
				
		for(int i=0;i<a.length;i++)
		{
			sum = 0;
			for(int j=0;j<a[i].length;j++)
			{
				sum += a[i][j];
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("==> "+sum);
			System.out.print("\n");
		}
		
	}
}