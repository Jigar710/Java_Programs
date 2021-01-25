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
		demo1 d1[] = new demo1[5];
		
		for(int i=0;i<d1.length;i++)
			d1[i] = new demo1();
		
		d1 = null;
		System.gc();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}