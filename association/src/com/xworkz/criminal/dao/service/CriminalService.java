package com.xworkz.criminal.dao.service;

import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dto.CriminalDTO;

public class CriminalService {
	
	private CriminalDAO dao;
	
	public CriminalService(CriminalDAO dao) {
		super();
		this.dao=dao;
	}
	




	public void validateAndsave(CriminalDTO dto)
	{   
	       if(dto!=null) {
	    	   System.out.println("Crimainal name is"+dto.getName());
	       }else
	       {
	    	   System.out.println("no name in Crimianal list");
	       }
		
		if(dto.getId()>0 && 
				dto.getName().length() >3 && dto.getName().length() <50 &&
				dto.getImprisonment()>0
				&& dto.getJailName().length()>12 && dto.getJailName().length()<30)
		{
			boolean s=dao.save(dto);
			System.out.println("Criminal Details is "+  dto);
			System.out.println(s);
		}
	}

}