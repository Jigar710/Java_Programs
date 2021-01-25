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

class third extends first implements sec
{
	public void disp2()
	{
		System.out.println("2");
	}
}

class ss
{
	public static void main(String ar[])
	{
		first z = new third();
		sec y = new third();
		
		z.disp1();
		y.disp2();
		
	}
}