import java.net.*;
import java.io.*;

class ser_th1
{
	public static void main(String ar[])throws Exception
	{
		ServerSocket ss = new ServerSocket(1000);
		Socket s1 = ss.accept();
		th sen1 = new th(s1,ss);
		sen1.start();
	}
}
class th extends Thread
{
	Socket s1;
	ServerSocket ss;
	th(Socket s2,ServerSocket ss)
	{
		s1 = s2;
		this.ss = ss;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				OutputStream os = s1.getOutputStream();
				SenderTherad sender = new SenderTherad(os);
				sender.start();
				Socket s = ss.accept();
				th sen = new th(s,ss);
				sen.start();
			}
			catch(Exception e)
			{}
		}
	}
}