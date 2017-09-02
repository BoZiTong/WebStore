package mypack;
import java.sql.*;
import java.util.Vector;

public class cartDB {
	public static int getQuantity(String itemId,String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from carts where iid='"+itemId+"' and uid='"+userId+"'";
		ResultSet rSet= con.executeQuery(sql);
		if(rSet.next())
			return rSet.getInt("quantity");
		else
			return -1;
	}
	

	public static Vector<String> getItem(String userId)throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from carts where uid='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		Vector<String> item = new Vector<String>();
		while(rSet.next()){	
			item.add(rSet.getString("iid"));
		}
		return item;
	}
	public static void deleteItem(String userId, String itemId)throws SQLException{
		connectDB con = new connectDB();
		String sql = "delete from carts where uid='"+userId+"' and iid='"+itemId+"'";
		con.executeUpdate(sql);
	}
	
	public static void addItem(String userId, String itemId,int quantity)throws SQLException{
		connectDB con = new connectDB();
	    Vector<String> item = getItem(userId);
	    for(int i = 0; i < item.size(); i++){
	    	if(item.get(i).equals(itemId)){
	    		int quan = getQuantity(itemId, userId) + quantity;
	    		String sql = "update carts set quantity='"+quan+"' where iid='"+itemId+"' and uid='"+userId+"'";
	    		con.executeUpdate(sql);
	    		return;
	    	}
	    }
		String sql = "insert into carts values('"+userId+"','"+itemId+"','"+quantity+"')";
		con.executeUpdate(sql);
	}
	
	public static synchronized double purchase(shoppingCart sCart) throws SQLException{
		double totalPrice = sCart.getTotal();
		sCart.clear();
		return totalPrice;
	 }
	
	public static synchronized double purchase(shoppingCart sCart, String itemId) throws SQLException{
		double price = sCart.getPrice(itemId);
		sCart.remove(itemId);
		return price;
	}
	
	public static synchronized double purchase(String userId)throws SQLException{
		Vector<String> item = cartDB.getItem(userId);
		double totalPrice = 0.0;
		for(int i = 0; i < item.size(); i++){
			totalPrice += itemDB.getPrice(item.get(i)) * cartDB.getQuantity(item.get(i), userId);
			cartDB.deleteItem(userId, item.get(i));
		}
		return shoppingCart.roundOff(totalPrice);
	}
	
	public static synchronized double purchase(String userId, String itemId)throws SQLException{
		double price = shoppingCart.roundOff(itemDB.getPrice(itemId) * cartDB.getQuantity(itemId, userId));
		cartDB.deleteItem(userId, itemId);
		return price;
	}
}
