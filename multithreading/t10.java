class test
{
	public static void main(String ar[])
	{	
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		System.out.println(t1);
		System.out.println(t2);
		
		Thread t3 = new Thread();
		System.out.println(t3);
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());
		
		t3.setName("third thread");
		t3.setPriority(10);
		System.out.println(t3);
		t3.setPriority(7);// can not set less then MIN_PRIORITY(1) and higher then MAX_PRIORITY(10)
		System.out.println(t3);
	}
}
class MyThread extends Thread
{
}