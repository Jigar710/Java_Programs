import java.io.*;
class ss
{
	public static void main(String ar[])throws Exception
	{
		int a;
		
		DataInputStream dis;
		dis = new DataInputStream(System.in);
		
		System.out.println("Enter the data");
		a = dis.readInt();
		
		System.out.println(a);
		
	}
}