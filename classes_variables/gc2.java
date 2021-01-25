class demo1
{
	public void finalize()
	{
		System.out.println("demo1 bye");
	}	
}
class demo2
{
	public void finalize()
	{
		System.out.println("demo2 bye");
	}	
}
class test
{
	public static void main(String ar[])	
	{
		demo1 d1 = new demo1();
		demo2 d2 = new demo2();
		d1 = null;
		System.gc();
		d2 = null;
		System.gc();
	}
}