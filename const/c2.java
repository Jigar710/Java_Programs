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
		demo d[] = new demo[5];
		
		for(int i=0;i<d.length;i++)
			d[i] = new demo();
	}
}