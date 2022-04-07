package com.xworkz.iplTeams.dao;

import com.xworkz.iplTeams.dto.iplTeamDTO;

public class iplTeamDAOImplementation extends iplTeamDAO{

	@Override
	public void save(iplTeamDTO dto) {
    // System.out.println("created iplTeam Dto");
     
     if(dto!=null && super.index<this.ipldto.length) {
    	 this.ipldto[super.index]=dto;
    	 super.index++;
    	 
    	 
    	 
    	// System.out.println("iplIplemntation created");
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


	public void  saveMultiple(iplTeamDTO dto1,iplTeamDTO dto2)
	{
		if(dto1==null && dto2==null) {
			System.out.println("value is null");
			return;
		}
		iplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		int multipleDAO=super.getMultipleIndex();
		if(multipleDAO<arrayFromDTOParent.length) {
			arrayFromDTOParent[multipleDAO]=dto1;
			System.out.println("dto added at index "+multipleDAO);	
			multipleDAO++;
		super.setMultipleIndex(multipleDAO);
		}		
		
		
		iplTeamDTO[] arrayFromDTOParent1=super.getIpldto();
		int multipleDAO1=super.getMultipleIndex();
		if(multipleDAO<arrayFromDTOParent1.length) {
			arrayFromDTOParent1[multipleDAO]=dto2;
			System.out.println("dto added at index "+multipleDAO);	
			multipleDAO++;
		super.setMultipleIndex(multipleDAO);
		}	
	}
		
		public void upDateSponserByName(String name,String sponser) {
			if(name==null && sponser==null  ) {
				System.out.println("update sponser by name");
				return ;
			}
			iplTeamDTO[] arrayOfDAO=super.getIpldto();
			
			for(int index=0;index<arrayOfDAO.length;index++) {
				
				

			}
		
		
	}
		public void upDateCaptainByName(String captain,String name) {
			 iplTeamDTO[] var=this.getIpldto();
			 for(int index=0;index<var.length;index++) {
				 if(var[index]!=null && var[index].getName().equals(var) ) {
			 var[index].setCaptain(captain);
				 
				 System.out.println("captain name updated to index"+index);
				 }



		}
			 




		}

	
	
	
	
	
	
	
	
}