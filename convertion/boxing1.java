//primitive to wrapper class
class demo
{
	public static void main(String ar[])
	{
		byte a;
		a = (byte)129;
		Byte p = new Byte(a); //Byte(byte)
		
		System.out.println(p);//p.toString()
		
		//p = new Byte("130");		//Byte(String)
			//not allowed bcoz outside the range of byte
			
		p = new Byte("13");		//Byte(String)
		System.out.println(p);//p.toString()
	}
}