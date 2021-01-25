import java.net.*;
import java.io.*;

class server_th1
{
	public static void main(String ar[])throws Exception
	{
		ServerSocket ss = new ServerSocket(1000);
		
		Socket s = ss.accept();
		
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		
		SenderTherad sender = new SenderTherad(os);
		sender.start();
		
		RecThread rec = new RecThread(is);
		rec.start();
	}
}