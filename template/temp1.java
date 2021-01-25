class demo<T>
{
	T a;
	void set(T m)
	{
		a = m;
	}
	void disp()
	{
		System.out.println(a);
	}
}
class ss
{
	public static void main(String ar[])
	{
		demo <String> z = new demo<String>();
		z.set("welcome");
		z.disp();
		
		demo <Integer> y = new demo<Integer>();
		y.set(45);
		y.disp();
		
		/*if(z==y)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diff");
		}*/
		//y = z;
		System.out.println(z);
		System.out.println(y);
		
		/*
		System.out.println(z);
		System.out.println(y);		
		*/
	}
}