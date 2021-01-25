abstract class demo1
{
	abstract void disp();
}
class demo2 extends demo1
{
	void disp()
	{
		//super.disp();
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