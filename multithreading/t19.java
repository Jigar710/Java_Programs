class res
{
	synchronized void disp(String msg,String open,String close)
	{
		System.out.print(open);
		System.out.print(msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		System.out.println(close);
	}
}
class MyThread extends Thread
{
	res r;	
	String msg,open,close;
	MyThread(res r,String msg,String open,String close)
	{
		this.r = r;
		this.msg = msg;
		this.open = open;
		this.close = close;
	}
	public void run()
	{
		r.disp(msg,open,close);
	}
}
class test
{
	public static void main(String ar[])
	{
		res r = new res();
		
		MyThread t1 = new MyThread(r,"welcome","[","]");	//==> [welcome]
		MyThread t2 = new MyThread(r,"to surat","{","}");	//==> {to surat}
		
		t1.start();
		t2.start();
	}
}