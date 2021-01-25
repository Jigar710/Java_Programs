//wait() notify() notifyAll() : Object class
class res
{
	int n;
	boolean flag=true;
	
	synchronized void set(int n)
	{
		if(flag==false)
		{
			try{
			wait();
			}
			catch(Exception e)
			{}
		}
		this.n = n;
		System.out.println("set : "+n);
		flag = false;
		notify();
		
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{}
	}
	synchronized void get()
	{
		if(flag == true)
		{
			try{
			wait();
			}
			catch(Exception e)
			{}	
		}
		System.out.println("get : "+n);
		flag = true;
		notify();
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