class demo1
{
	void disp()
	{
		System.out.println("super disp");
	}
}
class demo2 extends demo1
{
	void disp()
	{
		System.out.println("sub disp");
	}
}
class ss
{
	public static void main(String ar[])	
	{
		demo1 z = new demo2();
		z.disp();
	}
}