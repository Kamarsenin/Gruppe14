package no.nith;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;


public class SearchUserLisenceDAO {

	

	public ArrayList<UserLisence> getUserLisence() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Server Meta Info
		//private String url = "jdbc:mysql://localhost/darenordicdb";
		//private String user = "root";
		//private String password = "Nexus2490";
		String url = "jdbc:mysql://mysql.nith.no/boefin12";
		String user = "boefin12";
		String password = "Nexus2490";

		ArrayList<UserLisenceUnsorted> userLisencesUnsorted = new ArrayList<UserLisenceUnsorted>();
		ArrayList<UserLisence> userLisenceList = new ArrayList<UserLisence>();

		try {
			Connection connection = DriverManager.getConnection(url, user,
					password);

			String sql = " select user.userID, nickName, teamName, gameName, skillName, priority from user "
					+ "left join team on user.teamID = team.teamID "
					+ "left join user_skills on user.userID = user_skills.userID "
					+ "left join skills on user_skills.skillID = skills.skillID "
					+ "order by nickName asc";

			PreparedStatement stmnt = connection.prepareStatement(sql);

			ResultSet rs = stmnt.executeQuery();

			// HENTER DATA FRA DATABASEN OG LEGGER DE INN I EN ARRAYLIST AV
			// TYPEN USER_LISENCE_UNSORTED
			while (rs.next()) {
				userLisencesUnsorted.add(new UserLisenceUnsorted(rs
						.getInt("userID"), rs.getString("nickName"), rs
						.getString("teamName"), rs.getString("gameName"), rs
						.getString("skillName"), rs.getInt("priority")));
			}

			int previousID = 0;
			int userlicensIndex = -1;
			for(UserLisenceUnsorted unsortedUser : userLisencesUnsorted){
				if (previousID != unsortedUser.getUserID()) {
					userlicensIndex++;
					userLisenceList.add(new UserLisence(
							unsortedUser.getNickName(),
							unsortedUser.getTeamName(),
							unsortedUser.getGameName(), "", "",
							""));
					previousID = unsortedUser.getUserID();
				} 
				if(unsortedUser.getSkillName() != null){					
					UserLisence userSkill = userLisenceList.get(userlicensIndex);			
					if (unsortedUser.getPriority() == 1) {
						userSkill.setSkill1(unsortedUser.getSkillName());
					}
					if (unsortedUser.getPriority() == 2) {
						userSkill.setSkill2(unsortedUser.getSkillName());
					}
					if (unsortedUser.getPriority() == 3) {
						userSkill.setSkill3(unsortedUser.getSkillName());
					}
				}
			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}

		return userLisenceList;
	}

	// GET_USER_LISENCE
	public ArrayList<UserLisence> getUserLisence(String query) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Server Meta Info
		//private String url = "jdbc:mysql://localhost/darenordicdb";
		//private String user = "root";
		//private String password = "Nexus2490";
		String url = "jdbc:mysql://mysql.nith.no/boefin12";
		String user = "boefin12";
		String password = "Nexus2490";
		
		ArrayList<UserLisenceUnsorted> userLisencesUnsorted = new ArrayList<UserLisenceUnsorted>();
		ArrayList<UserLisence> userLisenceList = new ArrayList<UserLisence>();

		try {
			Connection connection = DriverManager.getConnection(url, user,
					password);

			String sql = " select user.userID, nickName, teamName, gameName, skillName, priority from user "
					+ "left join team on user.teamID = team.teamID "
					+ "left join user_skills on user.userID = user_skills.userID "
					+ "left join skills on user_skills.skillID = skills.skillID "
					+ "where nickName LIKE '%" + query + "%'"
					+ "order by nickName asc";

			PreparedStatement stmnt = connection.prepareStatement(sql);

			ResultSet rs = stmnt.executeQuery();

			// HENTER DATA FRA DATABASEN OG LEGGER DE INN I EN ARRAYLIST AV
			// TYPEN USER_LISENCE_UNSORTED
			while (rs.next()) {
				userLisencesUnsorted.add(new UserLisenceUnsorted(rs
						.getInt("userID"), rs.getString("nickName"), rs
						.getString("teamName"), rs.getString("gameName"), rs
						.getString("skillName"), rs.getInt("priority")));
			}
			int previousID = 0;
			int userlicensIndex = -1;
			for(UserLisenceUnsorted unsortedUser : userLisencesUnsorted){
				if (previousID != unsortedUser.getUserID()) {
					userlicensIndex++;
					userLisenceList.add(new UserLisence(
							unsortedUser.getNickName(),
							unsortedUser.getTeamName(),
							unsortedUser.getGameName(), "", "",
							""));
					previousID = unsortedUser.getUserID();
				} 
				if(unsortedUser.getSkillName() != null){					
					UserLisence user = userLisenceList.get(userlicensIndex);			
					if (unsortedUser.getPriority() == 1) {
						user.setSkill1(unsortedUser.getSkillName());
					}
					if (unsortedUser.getPriority() == 2) {
						user.setSkill2(unsortedUser.getSkillName());
					}
					if (unsortedUser.getPriority() == 3) {
						user.setSkill3(unsortedUser.getSkillName());
					}
				}
			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}

		return userLisenceList;
	}
}
