package mypack;
import java.sql.*;

public class connectDB {
	public static final String SQLDriver = "com.mysql.jdbc.Driver";
	//public static final String url = "jdbc:mysql://192.168.214.131:3306/webstore";
	public static final String url = "jdbc:mysql://localhost:3306/webstore";
	public static final String username = "root";
	public static final String password = "samael86";
	
	public Connection conn = null;
	private Statement stmt = null;
	ResultSet rs = null;
	public connectDB() {
	    try {
	      Class.forName(SQLDriver); 
	    }catch(java.lang.ClassNotFoundException e) {
	      System.err.println(e.getMessage());
	    }
	  }
	  
	  public ResultSet executeQuery(String sql) {
	    try {
	       conn = DriverManager.getConnection(url,username,password); 
	       stmt = conn.createStatement();
	       rs = stmt.executeQuery(sql);
	    }catch(SQLException ex) { 
	      System.err.println(ex.getMessage());
	    }
	    return rs;
	  }
	  
	  public void executeUpdate(String sql) {
	    stmt = null;
	    try {
	      conn = DriverManager.getConnection(url,username,password);
	      stmt = conn.createStatement();
	      stmt.executeUpdate(sql);
	     }catch(SQLException ex) { 
	      System.err.println(ex.getMessage());
	    }
	  }
	 
}
