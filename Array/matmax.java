import java.util.*;
class test
{
	public static void main(String ar[])
	{
		int a[][];
		int i,j;
		int max;
		
		a=new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("Enter a : ");
				a[i][j]=sc.nextInt();
			}
		}
		max=a[0][0];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.println(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("max : "+max);
	}
}
