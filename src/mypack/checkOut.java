package mypack;

import java.sql.*;

public class checkOut {
	public static String byNickName(String nickName, String password) {
		connectDB con =new connectDB();
		String uid = null;
		String sql = "select * from users where nickname='"+nickName+"' and password='"+password+"'";
		try{
			ResultSet rSet = con.executeQuery(sql);
			if(rSet.next()){
				uid = rSet.getString("id");
			}
		}catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
		}
		return uid;
	}
	
	public static String byMail(String mail, String password){
		connectDB con = new connectDB();
		String uid = null;
		String sql = "select * from users where mail='"+mail+"' and password='"+password+"'";
		try{
			ResultSet rSet = con.executeQuery(sql);
			if(rSet.next()){
				uid = rSet.getString("id");
			}
		}catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
		}
		return uid;
	}
	
	public static String byPhone(String phone, String password) {
		connectDB con = new connectDB();
		String uid = null;
		String sql = "select * from users where phone='"+phone+"' and password='"+password+"'";
		try{
			ResultSet rSet = con.executeQuery(sql);
			if(rSet.next()){
				uid = rSet.getString("id");
			}
		}catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
		}
		return uid;
	}
	
	public static int judge(String username){
		int len = username.length();
		if(username.contains("@"))
			return 1;
		for(int i = 0; i < len; i++){
			if(!Character.isDigit(username.charAt(i)))
				return 3;
		}
		return 2;
	}
}
