class test
{
	public static void main(String ar[])
	{	
		MyThread t1 = new MyThread("first",10);
		System.out.println(t1);
		t1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
		t1.setPriority(5);
		t1.setName("second");
		System.out.println(t1);
	}
}
class MyThread extends Thread
{
	MyThread(String a,int n)
	{
		setName(a);
		setPriority(n);
	}
	public void run()
	{
		System.out.println("A");
		try
		{
			Thread.sleep(5*1000);
		}
		catch(Exception e)
		{
		}
		System.out.println("B");
	}
}
		