/*
	wap to find Perfect numbers from 1 to 1000
*/
class Perfect
{
	boolean check(int n)
	{
		int d,a,sum = 0,mul=1;

		while(n!=0)
		{
			a = n % 10;
			sum = sum + a;
			mul = mul * a;
			n = n / 10;
		}
		
		if(sum == mul)
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
		System.out.println("Perfect numbers from 1 to 1000");
		
		Perfect p = new Perfect();
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