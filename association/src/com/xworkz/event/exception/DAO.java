package com.xworkz.exception;

import com.xworkz.iplTeams.dto.iplTeamDTO;

public abstract class DAO {
	
	
	
 DTO dto=new DTO();
protected int index;

public DAO() {
	System.out.println("DAO "+getClass().getName());
}


public  void save(DTO dto)
{

	System.out.println("Created save dto");
	
	if(dto!=null  && index<this.dto.l) 
	{
		dto[index]=dto;
		index++;
		System.out.println("DTO created "+dto);
		
		
	}
	
	
}











}
