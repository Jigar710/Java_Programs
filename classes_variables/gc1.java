class demo
{
	public void finalize()
	{
		System.out.println("bye bye");
	}	
}
class test
{
	public static void main(String ar[])	
	{
		demo d1 = new demo();
		//d1 = null;
		System.gc();
	}
}