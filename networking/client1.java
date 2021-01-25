import java.net.*;
import java.io.*;
import java.util.*;
class client1
{
	public static void main(String ar[])throws Exception
	{		
		Socket s = new Socket("localhost",1000);
		
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{			
			String msg = dis.readUTF();
			System.out.println(msg);
			
			msg = sc.next();
			dos.writeUTF(msg);
		}
	}
}