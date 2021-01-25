import java.sql.*;
class test
{
	public static void main(String ar[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gi_bca","root","");
		
		Statement st;
		st = con.createStatement();
		
		String q;
		q = "insert into student values (1,'ridham','naik','a@gmail.com','123')";
		
		int n = st.executeUpdate(q);
		
		System.out.println(n+" records inserted...");
	}
}	