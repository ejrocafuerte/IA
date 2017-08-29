package principal;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public String user="root";
	public String pass="rubik";
	public String dbName = "st";
	public String url = "jdbc:mysql://localhost/"+dbName;
	public Connection conn=null;
	
	public DBConn(){
		try{
			Class.forName("com.mysql.jdbc.Connection");
			conn = (Connection)DriverManager.getConnection(url,user,pass);
			if(conn!=null){
				System.out.println("Felicidades te conectaste a la base");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
