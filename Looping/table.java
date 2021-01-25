/*
wap to disp table of given number
input : 5
	5 * 1 = 5
	5 * 2 = 10
	..
	..
	5 * 10 = 50

*/
import java.util.*;
class demo
{
	public static void main(String ar[])
	{
		factor f = new factor();
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = sc.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = " + (i*n));
		}
	}
}