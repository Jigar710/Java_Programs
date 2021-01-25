class demo1
{
	void disp()
	{
		System.out.println("super disp");
	}	
	void show()
	{
		System.out.println("super show");
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
		demo1 z = new demo1();
		z.disp();
		z.show();
		
		demo1 y = new demo2();
		y.disp();
		y.show();
		
		demo2 x = new demo2();
		x.disp();		
		y.show();	
	}
}