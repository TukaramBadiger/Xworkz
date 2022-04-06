package com.xworkz.iplTeams.dto;



public class iplTeamDTO {

	
	private int id;
	private String name;
	private String sponser;
	private String captain;
	private int noOfWins;
	private int noOfLostMatch;

	
	
	public iplTeamDTO() {
		System.out.println("created");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSponser() {
		return sponser;
	}



	public void setSponser(String sponser) {
		this.sponser = sponser;
	}



	public String getCaptain() {
		return captain;
	}



	public void setCaptain(String captain) {
		this.captain = captain;
	}



	public int getNoOfWins() {
		return noOfWins;
	}



	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}



	public int getNoOfLostMatch() {
		return noOfLostMatch;
	}



	public void setNoOfLostMatch(int noOfLostMatch) {
		this.noOfLostMatch = noOfLostMatch;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((captain == null) ? 0 : captain.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		iplTeamDTO other = (iplTeamDTO) obj;
		if (captain == null) {
			if (other.captain != null)
				return false;
		} else if (!captain.equals(other.captain))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	

	





	





}

