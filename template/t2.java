class Stack
{
	String a[];
	int tos;
	Stack(int n)
	{
		a = new String[n];
		tos = -1;
	}
	void push(String p)
	{
		tos++;
		a[tos] = p;
	}
	void disp()
	{
		System.out.println();
		for(int i=tos;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	String pop()
	{
		String m;
		m = a[tos];
		tos--;
		return m;
	}
}

class ss
{
	public static void main(String ar[])
	{
		Stack s1 = new Stack(5);

		s1.push("prem");
		s1.push("jeet");
		s1.push("aditya");
		s1.push("shivam");
		s1.push("abcd");
		
		s1.disp();
		
		System.out.println("poped : "+s1.pop());
		System.out.println("poped : "+s1.pop());
		System.out.println("poped : "+s1.pop());
		
		s1.push("xyz");
		s1.disp();
	}
}