package no.nith;

public class UserLisenceUnsorted {

	//Attributes
		private int userID;
		private String nickName;
		private String teamName;
		private String gameName;
		private String skillName;
		private int priority;
		
		
		
		//Constructors
		public UserLisenceUnsorted (int userID, String nickName, String teamName, String gameName, 
				String skillName, int priority) {
			setUserID(userID);
			setNickName(nickName);
			setTeamName(teamName);
			setGameName(gameName);
			setSkillName(skillName);
			setPriority(priority);
		}
		
		//Methods	
		public int getUserID() {
			return userID;
		}
		
		public String getNickName() {
			return nickName;
		}
		
		public String getTeamName () {
			return teamName;
		}
		
		public String getGameName () {
			return gameName;
		}
		
		public String getSkillName () {
			return skillName;
		}
		
		public int getPriority () {
			return priority;
		}
		
		public void setUserID(int userID) {
			this.userID = userID;
		}
		
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		
		public void setTeamName (String teamName) {
			this.teamName = teamName;
		}
		
		public void setGameName (String gameName) {
			this.gameName = gameName;
		}
		
		public void setSkillName (String skillName) {
			this.skillName = skillName;
		}
		
		public void setPriority (int priority) {
			this.priority = priority;
		}
		


		
		
		
}
