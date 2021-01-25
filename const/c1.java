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
		demo d1;
		d1 = new demo();
		//System.out.println(d1);
		
		demo d2;
		d2 = new demo();
		
		demo d3 = new demo();
		
		new demo();
		
		demo d4 = new demo();
		d4 = null;
		
		{
			demo d5 = new demo();
		}
	}
}