//wap to add all numbers passed from cmd line args
class test
{
	public static void main(String ar[])
	{
		double sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum += Double.parseDouble(ar[i]);
		}
		System.out.println(sum);
	}
}
/*
String to byte (Byte class)
	public static byte parseByte(String n)
String to short (Short class)
	public static short parseShort(String n)
String to int(Integer class)
	public static int parseInt(String n)
String to long(Long class)
	public static long parseLong(String n)
String to float (Float class)
	public static float parseFloat(String n)
String to double(Double class)
	public static double parseDouble(String n)
*/