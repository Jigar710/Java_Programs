//wap to find row-wise minimum from matrix
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
				
		int min;
		System.out.print("\nOutput\n");
		
		for(int i=0;i<a.length;i++)
		{
			min = a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				
				if(a[i][j]<min)
					min = a[i][j];				
			}			
			System.out.print(" ==> "+min);
			System.out.print("\n");
		}		
	}
}