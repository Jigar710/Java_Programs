class Stack
{
	int a[];
	int tos;
	Stack(int n)
	{
		a = new int[n];
		tos = -1;
	}
	void push(int p)
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
	int pop()
	{
		int m;
		m = a[tos];
		tos--;
		return m;
	}
}
class ss
{
	public static void main(String ar[])
	{
		Stack s1 = new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.disp();
		
		System.out.println("poped : "+s1.pop());
		System.out.println("poped : "+s1.pop());
		System.out.println("poped : "+s1.pop());
		
		s1.disp();
			
		s1.push(100);
		s1.push(200);
		
		s1.disp();
	}
}