class gen<T extends Number>
{
	T a[];
	void set(T []m)
	{
		a = m;
	}
	void disp()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	gen<Double> add(gen<?> p)
	{
		gen<Double> w = new gen<Double>();
		Double d[] = new Double[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			d[i] = a[i].doubleValue() + p.a[i].doubleValue();
		}	
		w.set(d);
		return w;
	}
}
class ss
{
	public static void main(String ar[])
	{
		gen<Integer> z = new gen<Integer>();
		Integer i1[] = {10,20,30};
		z.set(i1);
		
		gen<Integer> y = new gen<Integer>();
		Integer i2[] = {1,2,1};
		y.set(i2);	
		
		gen<Double> x = new gen<>();//diamond types
		
		x = y.add(z);
		
		x.disp();
	}
}