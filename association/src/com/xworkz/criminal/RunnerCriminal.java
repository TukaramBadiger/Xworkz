package com.xworkz.criminal;

import com.xworkz.criminal.court.Court;
import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dao.service.CriminalService;
import com.xworkz.criminal.dto.CriminalDTO;

public class RunnerCriminal {

	public static void main(String[] args) {
	 CriminalDAO  dao=new Court();
	  CriminalService criminalserivice=new CriminalService(dao);
	  
	  CriminalDTO dto=new CriminalDTO();
	  dto.setId(689);
	  dto.setName( "kasab");
	  dto.setOffense( "Terrorist");
	  dto.setImprisonment( 81 );
	  dto.setJailName( "Yerwada Central jail in pune");
	  
	  
	  criminalserivice.validateAndsave(dto);
	  
	  
		

	}

}