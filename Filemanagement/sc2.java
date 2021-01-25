//wap to read int from the inputtted file

import java.io.*;
import java.util.*;
class ss
{
	public static void main(String ar[])throws Exception	
	{
		FileInputStream fis;
		fis = new FileInputStream("myfiile.txt");
		
		Scanner sc = new Scanner(fis);
		
		String msg = sc.next();
		while(sc.hasNext()==true)
		{
			try{
				int a = Integer.parseInt(msg);
				System.out.println(msg);
			}
			catch(Exception e)
			{}			
			msg = sc.next();
		}
		
		fis.close();
	}
}