import java.util.*;
class test
{
	public static void main(String arp[])
	{
		int a[][];
		int row;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Row : ");
		row=sc.nextInt();
		
		a=new int[row][];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0 || i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}






