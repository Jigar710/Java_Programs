class First
{
	private void disp1()
	{
		System.out.println("private");
	}
	void disp2()
	{
		System.out.println("def");
	}
	protected void disp3()
	{
		System.out.println("protected");
	}
	public void disp4()
	{
		System.out.println("public");
	}
}
class Second extends First
{}

class test
{
	public static void main(String ar[])
	{
		/*
		First z = new First();
//		z.disp1();
		z.disp2();
		z.disp3();
		z.disp4();
		*/
		Second y = new Second();
//		y.disp1();
		y.disp2();
		y.disp3();
		y.disp4();
		
	}
}