//jagged array
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
		demo d[][] = new demo[4][];
		d[0] = new demo[3];
		d[1] = new demo[2];
		d[2] = new demo[5];
		d[3] = new demo[1];
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j] = new demo();
			}
		}
	}
}