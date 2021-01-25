class first
{
	 void disp1()
	 {
		 System.out.println("1");
	 }
}
interface sec
{
	void disp2();
}

abstract class third extends first implements sec
{
	public void disp2()
	{
		System.out.println("2");
	}
	
	abstract void disp3();
}

class fourth extends third
{
	public void disp3()
	{
		System.out.println("3");
	}
}

class ss
{
	public static void main(String ar[])
	{
		first z = new fourth();
		sec y = new fourth();
		third x= new fourth();
		z.disp1();
		y.disp2();
		x.disp3();
	}
}