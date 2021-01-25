class test
{
	public static void main(String ar[])
	{
		if(ar.length > 0)
		{
			System.out.println("Decimal\tOctal\tHexa\tBinary");
			for(int i=0;i<ar.length;i++)
			{
				int n = Integer.parseInt(ar[i]);
				String b = Integer.toBinaryString(n);
				String o = Integer.toOctalString(n);
				String h = Integer.toHexString(n);
				
				System.out.println(n+"\t"+o+"\t"+h+"\t"+b);
			}
		}
		else
		{
			System.out.println("no data found");
		}
	}
}