class demo
{
	demo(String a)
	{
		System.out.println(a);
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo("first");
		
		demo d2;
		d2 = new demo("sec");
		
		new demo("third");
		
		demo d3;
		d3 = new demo("fourth");
		d3 = null;
		
		{
			demo d4;
			d4 = new demo("fifth");
		}
		
		demo d4;
		d4 = new demo("sixth");	
	}
}