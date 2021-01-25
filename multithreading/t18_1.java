class res
{
	int bal=1000;
	synchronized void update(int amount)
	{
		int temp = bal;
		temp = temp + amount;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		bal = temp;
		System.out.println("Balance : "+bal);
	}
}
class MyThread1 extends Thread
{
	res r;
	int amount;
	MyThread1(res r,int amount)
	{
		this.r = r;
		this.amount = amount;
	}
	public void run()
	{
		System.out.println("this is thread 1");
		r.update(amount);
	}
}
class MyThread2 extends Thread
{
	res r;
	int amount;
	MyThread2(res r,int amount)
	{
		this.r = r;
		this.amount = amount;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("welcome"+i);
		r.update(amount);
	}
}
class test
{
	public static void main(String ar[])
	{
		res r = new res();
		MyThread1 t1 = new MyThread1(r,1000);
		MyThread2 t2 = new MyThread2(r,2000);
		
		t1.start();
		t2.start();
	}
}