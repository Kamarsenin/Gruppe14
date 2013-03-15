package no.nith;

public class Team {

	private int teamID;
	private String teamName;
	private String gameName;
	
	public Team (int teadID, String teamName, String gameName) {
		setTeamName(teamName);
		setGameName(gameName);
	}
	
	public int getTeamID () {
		return teamID;
	}
	
	public String getTeamName () {
		return teamName;
	}
	
	public String getGameName () {
		return gameName;
	}
	
	public void setTeamID (int teamID) {
		this.teamID = teamID;
	}
	
	public void setTeamName (String teamName) {
		this.teamName = teamName;
	}
	
	public void setGameName (String gameName) {
		this.gameName = gameName;
	}
}
