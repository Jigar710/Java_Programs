class gen<T extends Number>
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
	boolean compare(gen<?> p)
	{
		if(a.intValue()>p.a.intValue())
			return true;
		else
			return false;
	}		
}
class ss
{
	public static void main(String ar[])
	{
		gen<Integer> g1 = new gen<Integer>();
		gen<Double> g2 = new gen<Double>();
		
		g1.set(10);
		g2.set(100.2);
		
		boolean t = g1.compare(g2);
		
		if(t == true)
		{
			g1.disp();
		}
		else
		{
			g2.disp();
		}
	}
}