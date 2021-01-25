class test8
{
	static public void main(String []x)
	{
		byte a = 100;
		System.out.println(a);
		
		a = 127;
		System.out.println(a);
		
		a = -127;
		System.out.println(a);
		
		a = -128;
		System.out.println(a);
		
		//a = 128;	//incompatiable type
		//a = (byte)128;
		a = (byte)129;
		//a = (byte)700;
		//a = byte(128);		<== compile time error
		System.out.println(a);		
	}
}
/*
0 + 127 + 128  = 256
300 - 256 = 44
*/