class test
{
	public static void main(String ar[])
	{	
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+"  ");
			}				
			System.out.println(": "+sum);
		}
	}
}