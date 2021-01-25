class Stack
{
	int a[];
	int tos;
	Stack()
	{
		a = new int[5];
		tos = -1;
	}
	void push(int n)
	{
		if(tos+1< a.length)
			a[++tos] = n;
		else
			System.out.println("full");
	}
	void pop()
	{
		if(tos!=-1)
			System.out.println(a[tos--]);
		else
			System.out.println("full");
	}
	void disp()
	{
		if(tos!=-1)
			for(int i=0;i<=tos;i++)
				System.out.println(a[i]);
		else
			System.out.println("full");
	}
}
class test
{
	public static void main(String ar[])
	{
		Stack s1 = new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.disp();
		s1.pop();
		s1.pop();
		s1.disp();
	}
}