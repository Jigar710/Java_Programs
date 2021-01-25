/*
	wap to find armstrong numbers from 1 to 10000
*/
class Armstrong
{
	boolean check(int n)
	{
		int d,a,sum = 0,len = 0,mul=1;
		
		d = n;
		
		while(n!=0)
		{
			len++;
			n = n / 10;
		}
		
		n = d;
		while(n!=0)
		{
			a = n % 10;
			
			mul = 1;
			for(int i=1;i<=len;i++)
			{
				mul = mul * a;
			}
			sum = sum + mul;
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
		System.out.println("Armstrong numbers from 1 to 1000");
		
		Armstrong arm = new Armstrong();
		for(int i=1;i<=10000;i++)
		{
			boolean b = arm.check(i);
			if(b == true)
			{
				System.out.print(i+"\t");
			}
		}
	}
}