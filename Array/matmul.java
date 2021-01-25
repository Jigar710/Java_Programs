import java.util.Scanner;
class test
{
	public static void main(String ar[])
	{
		int a[][],b[][],c[][];
		int i,j,k;
		
		a=new int[3][3];
		b=new int[3][3];
		c=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("Enter a : ");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print("Enter b : ");
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				for(k=0;k<b[i].length;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}




