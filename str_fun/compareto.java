class test
{
	public static void main(String ar[])
	{
		String s1 = "AAA";
		String s2 = "aBC";
		
		int n = s2.compareToIgnoreCase(s1);
		System.out.println("n : "+n);
		if(n>0)
			System.out.println("s1 is max : "+s1);
		else if(n<0)
			System.out.println("s2 is max : "+s2);
		else
			System.out.println("Both are same");
	}
}