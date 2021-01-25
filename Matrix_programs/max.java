//wap to find maximum from matrix
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
				
		int max;
		System.out.print("\nOutput\n");
		
		max = a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
					max = a[i][j];				
			}			
		}
		System.out.print("Max : " + max);
	}
}