/*
Scanner --- nextInt() -> Integer
			nextLine() || next(); -> String
*/
import java.util.Scanner;
class test
{
	public static void main(String ar[])
	{
		float a;
		String  b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		a=sc.nextFloat();
		System.out.println("a : "+a);
		
		System.out.print("Enter String : ");
		b=sc.next();
		System.out.println("b : "+b);
		
		
	}
}