package no.nith;

public class User {

	//Attributes
		private int userID;
		private String nickName;
		private String firstName;
		private String surName;
		private String email;
		private int teamID;
		
		//Constructors
		public User (int userID, String nickName, String firstName, 
				String surName, String email, int teamID) {
			setUserID(userID);
			setNickName(nickName);
			setFirstName(firstName);
			setSurName(surName);
			setEmail(email);
			setTeamID(teamID);
		}
		
		//Methods
		//GET
		public int getUserID() {
			return userID;
		}
		
		public String getNickName() {
			return nickName;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getSurName() {
			return surName;
		}
		
		public String getEmail() {
			return email;
		}
		
		public int getTeamID() {
			return teamID;
		}
		
		//SET
		public void setUserID(int userID) {
			this.userID = userID;
		}
		
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setSurName(String surName) {
			this.surName = surName;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setTeamID(int teamID) {
			this.teamID = teamID;
		}
}
