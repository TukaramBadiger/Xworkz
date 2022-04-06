package com.xworkz.iplTeams.dao;

import com.xworkz.iplTeams.dto.iplTeamDTO;

public abstract class iplTeamDAO {

	
	private  int IplTeamCount = 0;
	protected iplTeamDTO[] ipldto=new iplTeamDTO[14];
	protected int index=0;
	
	public  void save(iplTeamDTO dto)
	{

		System.out.println("Created save dto");
		
		if(dto!=null  && index<this.ipldto.length) 
		{
			this.ipldto[index]=dto;
			index++;
			System.out.println("IplTeamDTO created "+dto);
			
			
		}
		
		
	}

	public iplTeamDTO[] getIpldto() {
		return ipldto;
	
	}


	public iplTeamDTO findByNameAndSponsor(String Name, String Sponser) {
		if (Name == null  || Sponser==null) {
			System.err.println("ipl league passed");
			return null;
		}
		for (int index = 0; index < this.ipldto.length; index++) {
			if (this.ipldto[index] != null && this.ipldto[index].getName().equals(Name)  && this.ipldto[index].getSponser().equals(Sponser)) {
				System.out.println("The ipl team found " + index);
				return this.ipldto[index];
			}
		}
		System.err.println("The ipl team formed");
		return null;
	}

//	IplTeamDTO findByNameAndSponsorAndCaptain(String name,String sponsor,String captain)

	public iplTeamDTO findByNameAndSponsorAndCaptain(String Name,String Sponser,String captain) {
		
		if (Name==null  || Sponser==null || captain==null) {
			System.err.println("null");
			return null;
			}
		for(int index=0;index<this.ipldto.length;index++) {
			if(this.ipldto[index]!=null && this.ipldto[index].getName().equals(Name) && this.ipldto[index].getSponser().equals(Sponser) && this.ipldto[index].getCaptain().equals(captain)) {
				System.out.println("found "+index);
				return this.ipldto[index];		
				}
		}
		System.err.println("the ipl info");
		
		
		return null;
	}






public int totalTeams() {
	int iplTeamCount=0;
	for(int index=0;index<this.ipldto.length;index++) {
		if(this.ipldto[index]!=null) {
			iplTeamCount++;
		}
	}

return iplTeamCount;
}

}
