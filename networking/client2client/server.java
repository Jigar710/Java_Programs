import java.net.*;
import java.io.*;

class server
{
	public static void main(String ar[])throws Exception
	{
		ServerSocket ss = new ServerSocket(1000);
		
		Socket s1 = ss.accept();
		Socket s2 = ss.accept();
		
		InputStream is1 = s1.getInputStream();
		InputStream is2 = s2.getInputStream();
		
		OutputStream os1 = s1.getOutputStream();
		OutputStream os2 = s2.getOutputStream();
		
		MyThread th1 = new MyThread(is1,os2);
		MyThread th2 = new MyThread(is2,os1);
		
		th1.start();
		th2.start();		
		
	}
}