import java.sql.*;

class test
{
	public static void main(String ar[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		
		CallableStatement cs;
		cs = con.prepareCall("call users()");
		
		ResultSet rs = cs.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" : "+rs.getString(3)+" : "+rs.getString(2));
		}
	}
}
/*
//Statement ==> PreparedStatement ==> CallableStatement
Statement st = con.createStatement();
PreparedStatement ps = con.prepaterStatment("query");
CallableStatement cs = con.prepareCall("call pro_name()");
*/
