package principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

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
		}catch(SQLException ex){
			System.out.println("Conexion Fallida");
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public ResultSet getQuery(String _query){
		Statement sentencia = null;
		ResultSet resultado = null;
		try{
			sentencia = (Statement)conn.createStatement();
			resultado=sentencia.executeQuery(_query);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return resultado;
	}
	
	public void setQuery(String _query){
		Statement sentencia=null;
		try{
			sentencia=(Statement)conn.createStatement();
			sentencia.execute(_query);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
