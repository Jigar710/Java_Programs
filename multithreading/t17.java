class test
{
	public static void main(String ar[])
	{
		MyThread t1 = new MyThread("first",1);
		MyThread t2 = new MyThread("second",10);
		MyThread t3 = new MyThread("third",5);
		
		t1.start();
		t2.start();
		t3.start();
		try
		{
			Thread.sleep(10*1000);
		}
		catch(Exception e)
		{}
		t1.close();
		t2.close();
		t3.close();
		
		t1.disp();
		t2.disp();
		t3.disp();
	}
}
class MyThread extends Thread
{
	long cnt=0;
	boolean flag = true;
	MyThread(String name,int pri)
	{
		setName(name);
		setPriority(pri);
	}
	public void run()
	{
		while(flag)
		{
			cnt++;
		}
	}
	void close()
	{
		System.out.println("A");
		flag = false;
	}
	void disp()
	{
		System.out.println(getName()+" : "+cnt);
	}
}