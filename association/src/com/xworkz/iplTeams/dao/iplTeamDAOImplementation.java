package com.xworkz.iplTeams.dao;

import com.xworkz.iplTeams.dto.iplTeamDTO;

public class iplTeamDAOImplementation extends iplTeamDAO{

	@Override
	public void save(iplTeamDTO dto) {
     System.out.println("created iplTeam Dto");
     
     if(dto!=null && super.index<this.ipldto.length) {
    	 this.ipldto[super.index]=dto;
    	 super.index++;
    	 
    	 
    	 
    	 System.out.println("iplIplemntation created");
     }
	
	}
	

	public iplTeamDTO IplTeamDTOfindByName(String name)
	{
		iplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getCaptain()==(name))
			{
				System.out.println("Name is found"+index);
				return ipldto[super.index];
			}
			else
			{
				System.out.println("Name is not found"+index);
				return null;
			}
		}
		return null;
	
	}

	
}