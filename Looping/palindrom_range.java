/*
	wap to find palindrome numbers from 1 to 1000
*/
class Palindrome
{
	boolean check(int n)
	{
		int d,a,sum = 0;
		
		d = n;
		while(n!=0)
		{
			a = n % 10;
			sum = sum * 10 + a;
			n = n / 10;
		}
		
		if(d == sum)
		{
			return true;
		}
		return false;
	}
}
			
class demo
{
	public static void main(String ar[])
	{
		System.out.println("Palindrome from 1 to 1000");
		
		Palindrome p = new Palindrome();
		for(int i=1;i<=1000;i++)
		{
			boolean b = p.check(i);
			if(b == true)
			{
				System.out.print(i+"\t");
			}
		}
	}
}