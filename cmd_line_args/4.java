
/*
wap to find max from numbers passes from cmd line args
wap to get number from cmd line arg and find factorial of that number
wap to get number from cmd line arg and disp table
wap to get number from cmd line arg and disp fibonaccie series
java test 7	(limit : 7)
	0	1	1	2	3	5	8 
java test 10 11 5	(start1 = 10,start2=11,limit : 5)
	10	11	21	33	54

java test 10  5	
	error
		java test num_of_terms
		java test first sec num_of_terms
*/

//java test 10 20		==> start = 10 , end = 20 ,gape = 1
//java test 10 			==> start = 0 , end = 10 , gape = 1
//java test 10 	20 2	==> start = 10 , end = 20, gape = 2
//java test 20 	10 -1	==> start = 20 , end = 10, gape = -1
//java test 20 	10 1	==> start = 20 , end = 10, gape = 1
//java test -1 	-5 -1	==> start = -1 , end = -5, gape = -1

class test
{
	public static void main(String ar[])
	{
		int start = Integer.parseInt(ar[0]);
		int end = Integer.parseInt(ar[1]);
		
		System.out.println("Decimal\tOctal\tHexa\tBinary");		
		for(int i=start;i<=end;i++)
		{
			String b = Integer.toBinaryString(i);
			String o = Integer.toOctalString(i);
			String h = Integer.toHexString(i);
			
			System.out.println(i+"\t"+o+"\t"+h+"\t"+b);
		}
	}
}
