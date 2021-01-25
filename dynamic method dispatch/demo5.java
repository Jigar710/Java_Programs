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
	void show()
	{
		System.out.println("sub show");
	}
}
class ss
{
	public static void main(String ar[])	
	{
		demo1 z = new demo1();
		z.disp();
		//z.show(); error method not found
		
		demo1 y = new demo2();
		y.disp();
//		y.show();	error cant find symbol
		
		demo2 x = new demo2();
		x.disp();		
		x.show();	
	}
}