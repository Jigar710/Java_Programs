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
		
		demo2 y = new demo2();
		y.disp();
		
		demo1 x = new demo1();
		x.disp();
		
		/*demo2 t = new demo1(); //compile time error
		t.disp();*/
	}
}