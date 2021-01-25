class demo
{
	demo()
	{
		System.out.println("def");
	}
	void disp()
	{
		System.out.println("disp");
	}
}
class test
{
	public static void main(String ar[])
	{
		demo d1 = new demo();
		d1.disp();
		
		new demo().disp();
	}
}