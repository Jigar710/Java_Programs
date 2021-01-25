import java.net.*;
import java.io.*;

class client_th1
{
	public static void main(String ar[])throws Exception
	{		
		Socket s = new Socket("localhost",1000);
		
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		
		SenderTherad sender = new SenderTherad(os);
		sender.start();
		
		RecThread rec = new RecThread(is);
		rec.start();
	}
}