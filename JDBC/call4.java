import java.sql.*;
import java.util.*;

class test
{
	public static void main(String ar[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		
		CallableStatement cs;
		cs = con.prepareCall("call countUsers(?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		cs.setInt(1,id);
		cs.registerOutParameter(2,Types.INTEGER);
		
		cs.executeQuery();
		System.out.println(cs.getInt(2));
	}
}