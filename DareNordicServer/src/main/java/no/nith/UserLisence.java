package no.nith;

public class UserLisence {

	//Attributes
		private String nickName;
		private String teamName;
		private String gameName;
		private String skill1;
		private String skill2;
		private String skill3;
		
		
		//Constructors
		public UserLisence (String nickName, String teamName, String gameName, 
				String skill1, String skill2, String skill3) {
			setNickName(nickName);
			setTeamName(teamName);
			setGameName(gameName);
			setSkill1(skill1);
			setSkill2(skill2);
			setSkill3(skill3);
		}
		
		//Methods		
		public String getNickName() {
			return nickName;
		}
		
		public String getTeamName () {
			return teamName;
		}
		
		public String getGameName () {
			return gameName;
		}
		
		public String getSkill1 () {
			return skill1;
		}
		
		public String getSkill2 () {
			return skill2;
		}
		
		public String getSkill3 () {
			return skill3;
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
		
		public void setSkill1 (String skill1) {
			this.skill1 = skill1;
		}
		
		public void setSkill2 (String skill2) {
			this.skill2 = skill2;
		}
		
		public void setSkill3 (String skill3) {
			this.skill3 = skill3;
		}

		
		
		
}
