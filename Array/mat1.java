class test
{
	public static void main(String ar[])
	{	
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				//a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+"  ");
			}				
			System.out.println();
		}
	}
}