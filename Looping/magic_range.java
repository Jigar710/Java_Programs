/*
	wap to find magic numbers from 1 to 1000
*/
class Magic
{
	boolean check(int n)
	{
		int d,a,sum = 0;

		while(n>9)
		{
			sum = 0;
			while(n!=0)
			{
				a = n % 10;
				sum = sum + a;
				n = n / 10;
			}
			n = sum;
		}
		
		if(sum == 1)
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
		System.out.println("Magic numbers from 1 to 1000");
		
		Magic m = new Magic();
		for(int i=1;i<=1000;i++)
		{
			boolean b = m.check(i);
			if(b == true)
			{
				System.out.print(i+"\t");
			}
		}
	}
}