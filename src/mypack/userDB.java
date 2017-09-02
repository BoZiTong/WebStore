package mypack;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;


public class userDB {
	public static String getNickName(String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("nickname");
		else
			return null;
	}
	
	public static String getGender(String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from userss where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("gender");
		else
			return null;
	}
	
	public static String getMail(String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("mail");
		else
			return null;
	}
	
	public static Vector<String> getMail() throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users";
		Vector<String> mail = new Vector<>(); 
		ResultSet rSet = con.executeQuery(sql);
		while(rSet.next()){
			mail.add(rSet.getString("mail"));
		}
		return mail;
	}
	
	public static String getPhone(String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("phone");
		else
			return null;
	}
	
	public static String getAddress(String userId) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("address");
		else
			return null;
	}
	
	public static String getPassword(String userId) throws Exception{
		connectDB con = new connectDB();
		String sql = "select * from users where id='"+userId+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("password");
		else
			return null;
	}
	
	public static void setNickName(String userId, String nickName) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set nickname='"+nickName+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	
	public static void setGender(String userId, String gender) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set gender='"+gender+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	
	public static void setMail(String userId, String mail) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set mail='"+mail+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	
	public static void setPassword(String userId, String password) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set password='"+password+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	
	public static void setPhone(String userId, String phone) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set phone='"+phone+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	
	public static void setAddress(String userId, String address) throws SQLException{
		connectDB con = new connectDB();
		String sql = "update users set address='"+address+"' where id='"+userId+"'";
		con.executeUpdate(sql);
	}
	public static String getUser(String mail) throws SQLException{
		connectDB con = new connectDB();
		String sql = "select * from users where mail='"+mail+"'";
		ResultSet rSet = con.executeQuery(sql);
		if(rSet.next())
			return rSet.getString("id");
		else
			return null;
	}
	public static String insertUser(String password,String nickName,String gender,String mail,String phone,String address) throws UnsupportedEncodingException{
		Calendar calendar = Calendar.getInstance();
		String userId = calendar.getTime().toString().substring(7,15).getBytes("utf-8").toString().substring(0, 7);
		connectDB con = new connectDB();
		String sql = "insert into users values('"+userId+"','"+password+"','"+nickName+"','"+gender+"','"+mail+"','"+phone+"','"+address+"')";
		con.executeUpdate(sql);
		return userId;
	}
	
}
