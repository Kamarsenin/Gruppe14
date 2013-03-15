package no.nith;

public class Skill {
	
	private int skillID;
	private String skillName;
	
	public Skill (int skillID, String skillName) {
		setSkillID(skillID);
		setSkillName(skillName);
	}
	
	public int getSkillID () {
		return skillID;
	}

	public String getSkillName () {
		return skillName;
	}
	
	public void setSkillID (int skillID) {
		this.skillID = skillID;
	}
	
	public void setSkillName (String skillName) {
		this.skillName = skillName;
	}
}
