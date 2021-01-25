interface first
{
	void disp1();
	 
}
interface sec
{
	void disp1();
}

interface third extends sec,first
{
	void disp1();
}

class fourth implements third
{
	/*public void disp2()
	{
		System.out.println("2");
	}*/
	public void disp1()
	{
		 System.out.println("1");
	 }
	/*public void disp3()
	{
		System.out.println("3");
	}*/
}

class ss
{
	public static void main(String ar[])
	{
		first z = new fourth();
		sec y = new fourth();
		third x= new fourth();
		z.disp1();
		y.disp1();
		x.disp1();
	}
}