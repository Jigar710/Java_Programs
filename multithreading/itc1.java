class res
{
	int n;
	void set(int n)
	{
		this.n = n;
		System.out.println("set : "+n);
	}
	void get()
	{
		System.out.println("get : "+n);
	}
}
class Producer extends Thread
{
	res r;
	Producer(res r)
	{
		this.r = r;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			r.set(i);
		}
	}
}
class Consumer extends Thread
{
	res r;
	Consumer(res r)
	{
		this.r = r;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			r.get();
		}
	}
}
class test
{
	public static void main(String ar[])
	{
		res r = new res();
		
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		p.start();
		c.start();
	}
}