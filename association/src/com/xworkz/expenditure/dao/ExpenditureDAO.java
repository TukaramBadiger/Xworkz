package com.xworkz.expenditure.dao;

import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureDAO {
	private ExpenditureDTO[] expenditureDTO=new ExpenditureDTO[20];
	private int expenditureIndex=0;
	
	
	public ExpenditureDAO() {
		System.out.println("created"+this.getClass().getSimpleName());
		}

	 
	public boolean create(ExpenditureDTO dto) {
		System.out.println("ceating expenditure"+dto.getAmount());
		
		if(expenditureIndex<this.expenditureDTO.length)
		{
			this.expenditureDTO[expenditureIndex]=dto;
			expenditureIndex++;
			System.out.println("expenditure added"+this.expenditureIndex);
			return true;
		}
		else {
			System.out.println("expenditure cannot be added,");
		}
	return false;
	
	}
	
	}
