//Hierarchical inheritance
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
class Third extends First
{
	void disp3()
	{
		System.out.println("third");
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
		t.disp3();
	}
}