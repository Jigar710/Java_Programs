//wap to find col-wise maximum from matrix
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
				
		int max[] = new int[3];
		System.out.print("\nOutput\n");
		
		for(int i=0;i<a.length;i++)
		{
			max[i] = a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				
				if(a[j][i]>max[i])
					max[i] = a[j][i];				
			}			
			System.out.print("\n");
		}	
		System.out.println("---------------------");
		for(int i=0;i<max.length;i++)
		{
			System.out.print(max[i]+"\t");
		}
	}
}