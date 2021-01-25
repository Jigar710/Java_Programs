/*
	Threads in JAVA
	MultiThreading 
*/
class test
{
	public static void main(String ar[])
	{
		demo d = new demo();
		d.show1();
		d.show2();
		d.show3();
	}
}
class demo
{
	void show1()
	{
		System.out.println("this is show1");
	}
	void show2()
	{
		System.out.println("this is show2");
	}
	void show3()
	{
		System.out.println("this is show3");
	}
}