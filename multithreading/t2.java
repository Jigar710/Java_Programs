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
		System.out.println("bye from main");
	}
}
class demo
{
	void show1()
	{
		System.out.println("this is show1");
		show2();
		System.out.println("bye from show1");
	}
	void show2()
	{
		System.out.println("this is show2");
		show3();
		System.out.println("bye from show2");
	}
	void show3()
	{
		System.out.println("this is show3");
		System.out.println("bye from show3");
	}
}