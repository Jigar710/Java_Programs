class test
{
	public static void main(String ar[])
	{	
		first f = new first();
		f.run();
		
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
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
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