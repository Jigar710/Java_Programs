//Hybrid inheritance
class First
{
	void disp1()
	{
		System.out.println("First");
	}
}
class Second extends First
{
	void disp2()
	{
		System.out.println("sec");
	}
}
class Third extends Second
{
	void disp3()
	{
		System.out.println("third");
	}
}
class Fourth extends Second
{
	void disp4()
	{
		System.out.println("fourth");
	}
}
class test
{
	public static void main(String ar[])
	{
		First z = new First();
		z.disp1();
		
		Second s = new Second();
		s.disp1();
		s.disp2();
		
		Third t = new Third();
		t.disp1();		
		t.disp2();		
		t.disp3();
		
		Fourth f = new Fourth();
		f.disp1();		
		f.disp2();		
		f.disp4();
	}
}