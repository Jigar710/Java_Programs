class test
{
	public static void main(String ar[])
	{	
		first f1 = new first(1);
		f1.setName("first");
		f1.start();
		
		first f2 = new first(100);
		f2.setName("sec");
		f2.start();
		
		Thread t = Thread.currentThread();
		t.setName("main thread");
		for(int i=1;i<=5;i++)
		{
			System.out.println(t.getName()+" : "+i*10);
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class first extends Thread
{
	int n;
	Thread t;
	first(int  n)
	{
		this.n = n;		
	}
	public void run()
	{
		t = Thread.currentThread();
		String name = t.getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" : " +i*n);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}