package mypack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class orderDB {
	public static float getPrice(String orderId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from orders where oid='"+orderId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getFloat("price");
		else
			return 0.0f;
	}
	
	public static String getDescription(String orderId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from orders where oid='"+orderId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("description");
		else
			return null;
	}
	
	public static Vector<String> getOrder(String userId)throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from orders where uid='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		Vector<String> order = new Vector<String>();
		while(rSet.next()){	
			order.add(rSet.getString("oid"));
		}
		return order;
	}
	
	public static void insertOrder(String orderId, String userId, String description, double price){
		connectDB con = new connectDB();
		String sql = "insert into orders values('"+orderId+"','"+userId+"','"+price+"','"+description+"')";
		con.executeUpdate(sql);
	}
}
