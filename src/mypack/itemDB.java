package mypack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class itemDB {
	
	public static float getPrice(String itemId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from items where id='"+itemId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getFloat("price");
		else
			return 0.0f;
	}
	public static int getQuantity(String itemId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from items where id='"+itemId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getInt("quantity");
		else
			return -1;
	}
	public static String getDescription(String itemId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from items where id='"+itemId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("description");
		else
			return null;
	}
	
	public static String getName(String itemId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from items where id='"+itemId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("name");
		else
			return null;
	}
	
	public static Vector<String> getItem() throws SQLException{
		Vector<String> item = new Vector<String>();
		connectDB con = new connectDB();
		String sql = "select * from items";
		ResultSet rSet = con.executeQuery(sql);
		while(rSet.next()){
			item.add(rSet.getString("id"));
		}
		return item;
	}
	public static void setQuantity(String itemId, int quantity) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update items set quantity=quantity-'"+quantity+"' where id='"+itemId+"'";
		con.executeUpdate(sql);
	}
}
