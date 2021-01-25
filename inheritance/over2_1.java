class First
{
	void disp1()
	{
		System.out.println("First");
	}	
}
class Second extends First
{
	void disp()
	{
		super.disp1();
		System.out.println("sec");
	}
}
class Third extends Second
{
	void disp()
	{
		super.disp1();
		System.out.println("third");
	}
}

class test
{
	public static void main(String ar[])
	{
		Third t = new Third();
		t.disp();
		
		Second s = new Second();
		s.disp();		
		
		First f = new First();
		f.disp1();
	}
}