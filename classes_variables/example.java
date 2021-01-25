class demo
{
	{
		System.out.println("non static");
	}
	static 
	{
		System.out.println("static");
	}
}

class test1
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		demo d2 = new demo();	

		try
		{
			Thread.sleep(5000); 
		}
		catch(Exception e)
		{}		
	}
}
class test2
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{}
	}
}