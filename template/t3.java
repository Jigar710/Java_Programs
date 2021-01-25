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
		demo<Integer> z = new demo<Integer>();
		z.set(10);
		z.disp();
		
		demo<Float> y = new demo<Float>();
		y.set(10.2f);
		y.disp();
		
		demo<String> x = new demo<String>();
		x.set("welcome");
		x.disp();
		
		demo<emp> t = new demo<emp>();
		t.set(new emp());
		t.disp();
	}
}
class emp{}