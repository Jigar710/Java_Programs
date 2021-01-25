//wap to read int from the inputtted file

import java.io.*;
import java.util.*;
class ss
{
	public static void main(String ar[])throws Exception	
	{
		FileInputStream fis;
		fis = new FileInputStream("myfiile.txt");
		
		int msg;
		Scanner sc = new Scanner(fis);
		
		while(sc.hasNext()==true)
		{
			try{
			msg = sc.nextInt();
			System.out.println(msg);
			}
			catch(Exception e){
				sc.next();
			}
		}
		
		fis.close();
	}
}