class First
{
	void disp()
	{
		System.out.println("First");
	}
}
class Second extends First
{
	void disp()
	{
		super.disp();
		System.out.println("sec");
	}
}
class Third extends Second
{
	void disp()
	{
		super.disp();
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
		f.disp();
	}
}