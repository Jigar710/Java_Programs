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
class MyThread extends Thread
{
	res r;
	int amount;
	MyThread(res r,int amount)
	{
		this.r = r;
		this.amount = amount;
	}
	public void run()
	{
		r.update(amount);
	}
}
class test
{
	public static void main(String ar[])
	{
		res r = new res();
		MyThread t1 = new MyThread(r,1000);
		MyThread t2 = new MyThread(r,2000);
		
		t1.start();
		t2.start();
	}
}