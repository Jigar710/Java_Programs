class demo
{
	Object a;
	void set(Object m)
	{
		a = m;
	}
	void disp()
	{
		System.out.println("second class " +a);
	}
}

class ss
{
	public static void main(String ar[])
	{
		demo z = new demo();
		z.set(10);
		z.disp();
		
		demo y = new demo();
		y.set("confused");
		y.disp();	
		/*
		if(z==y)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diff");
		}*/
		System.out.println(z);
		System.out.println(y);
		
		y = z;
		
		System.out.println(z);
		System.out.println(y);		
		
	}	
}










