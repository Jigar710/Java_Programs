class test
{
	public static void main(String ar[])
	{	
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("first thread");
		t.setPriority(10);
		System.out.println(t);		
	}
}