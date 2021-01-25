class gen<T1,T2>
{
	T1 a;
	T2 b;
	void set(T1 m,T2 n)
	{
		a = m;
		b = n;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class ss
{
	public static void main(String ar[])
	{
		gen<Integer,Float> x = new gen<>();
		x.set(10,12.35f);
		x.disp();
		
		gen<String,String> y = new gen<>();
		y.set("hi","welcome");
		y.disp();
	}
}