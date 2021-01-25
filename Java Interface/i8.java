interface first
{
	void disp1();
	 
}
interface sec
{
	void disp1();
}

class third implements sec,first
{
	public void disp1()
	{
		 System.out.println("1");
	 }

}

/*class fourth implements third
{
	public void disp2()
	{
		System.out.println("2");
	}
	public void disp3()
	{
		System.out.println("3");
	}
}*/

class ss
{
	public static void main(String ar[])
	{
		first z = new third();
		sec y = new third();
		//third x= new third();
		z.disp1();
		y.disp1();
	//	x.disp3();
	}
}