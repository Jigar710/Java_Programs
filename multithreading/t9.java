class test
{
	public static void main(String ar[])
	{	
		first f1 = new first(1);
		f1.start();
		
		first f2 = new first(100);
		f2.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*10);
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
	first(int  n)
	{
		this.n = n;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);
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