/*
1	
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1

	(prev row-same col) + (prev row - prev col)
*/
import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[][],n,i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number of Row : ");
		n=sc.nextInt();
		
		a=new int[n][n];
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(j==0 || i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


