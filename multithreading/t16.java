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
	}
}
class MyThread extends Thread
{
	MyThread(String name,int pri)
	{
		setName(name);
		setPriority(pri);
	}
	public void run()
	{
		System.out.println(getName());
	}
}