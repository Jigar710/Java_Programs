class demo
{
	demo()
	{
		System.out.println("def");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d[][] = new demo[2][3];
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j] = new demo();
			}
		}
	}
}