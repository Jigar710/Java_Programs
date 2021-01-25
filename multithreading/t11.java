class test
{
	public static void main(String ar[])
	{	
		Thread t1 = new Thread("first");
		System.out.println(t1);
		t1.start();
		t1.setName("second");
		System.out.println(t1);
	}
}