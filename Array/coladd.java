class test
{
	public static void main(String ar[])
	{	
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum[]=new int[3];
		int add=0;
		for(int i=0;i<a.length;i++)
		{
			//add=0;
			for(int j=0;j<a[i].length;j++)
			{
				//add=add+a[j][i];
				sum[i]=sum[i]+a[i][j];
				System.out.print(a[i][j]+"\t");
			}				
			System.out.println();
			//sum[i]=add;
		}
		System.out.println("---------------------------------------");
		for(int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+"\t");
		}
		
		
		
		
	}
}