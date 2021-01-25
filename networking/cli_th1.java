import java.net.*;
import java.io.*;

class cli_th1
{
	public static void main(String ar[])throws Exception
	{		
		Socket s = new Socket("localhost",1000);
		
		InputStream is = s.getInputStream();
		
		RecThread rec = new RecThread(is);
		rec.start();
	}
}