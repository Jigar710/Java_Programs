// wap to get matrix and disp it in reverse order
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
		
		System.out.println("\nOutput\n");
		
		
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}