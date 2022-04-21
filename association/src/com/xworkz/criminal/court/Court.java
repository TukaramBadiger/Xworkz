package com.xworkz.criminal.court;

import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dto.CriminalDTO;

public class Court implements  CriminalDAO{

	@Override
	public boolean save(CriminalDTO dto) {
		System.out.println("save method is running");
		return false;
	}

}