package no.nith;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

public class SearchUsersDAO {
	
	//Server Meta Info
	private String url = "jdbc:mysql://localhost/darenordicdb";
	private String user = "root";
	private String password = "Nexus2490";
	
	//Fetch everything
	public ArrayList<User> getUsers() {
		
		ArrayList<User> users = new ArrayList<User>();

		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			
			//SQL Statement
			String sql = "SELECT * FROM user";
			PreparedStatement stmnt = connection.prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				users.add(new User(
						rs.getInt("userID"),
						rs.getString("nickName"),
						rs.getString("firstName"),
						rs.getString("surName"),
						rs.getString("email"),
						rs.getInt("teamID")
				));
			}
		}
		catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}
		
		return users;
	}
	
	public ArrayList<User> getUsers(String query) {
		
		ArrayList<User> users = new ArrayList<User>();

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			
			String sql = "select * from user where nickName like '%" + query + "%' " +
			"or firstName like '" + query + "' or surName like '" + query + "'";
			
			PreparedStatement stmnt = connection.prepareStatement(sql);
			
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				users.add(new User(
						rs.getInt("userID"),
						rs.getString("nickName"),
						rs.getString("firstName"),
						rs.getString("surName"),
						rs.getString("email"),
						rs.getInt("teamID")
				));

			}
		}
		catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}
		
		return users;
	}

}
