class demo1
{
	public void finalize()
	{
		System.out.println("demo1 bye");
	}	
}
class test
{
	public static void main(String ar[])	
	{
		demo1 d1 = new demo1();
		demo1 d2 = new demo1();
		d1 = null;
		System.gc();
		d2 = null; 
		System.gc();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}