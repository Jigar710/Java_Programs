import java.net.*;
import java.io.*;

class client
{
	public static void main(String ar[])throws Exception
	{
		Socket s = new Socket("localhost",1000);
	
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		SenderTherad sender = new SenderTherad(os);
		RecThread rec = new RecThread(is);
		
		sender.start();
		rec.start();
	}
}