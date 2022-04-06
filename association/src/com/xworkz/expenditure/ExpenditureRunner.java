package com.xworkz.expenditure;

import com.xworkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expenditure.dao.ExpenditurePeriod;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureRunner {

	public static void main(String [] args) {
		ExpenditureDTO dto=new ExpenditureDTO();
		dto.setPersonName("OM");
		dto.setSpentOn("java");
	dto.setAmount(25000);
	dto.setTax(20);
	dto.setExpenditurePeriod(ExpenditurePeriod.BI_WEEKLY);
	
	ExpenditureDAO dao=new ExpenditureDAO();
	boolean create=dao.create(dto);
	System.out.println("create"+create);
	
	
	
	ExpenditureDTO dto1=new ExpenditureDTO();
	dto1.setPersonName("Manju");
	dto1.setSpentOn("Apple");
	dto1.setAmount(250);
	dto1.setTax(25);
	dto1.setExpenditurePeriod(ExpenditurePeriod.DAILY);
	
	ExpenditureDTO dto2=new ExpenditureDTO();
	dto2.setPersonName("Ram");
	dto2.setSpentOn("Sql");
	dto2.setAmount(12000);
	dto2.setTax(10);
	dto2.setExpenditurePeriod(ExpenditurePeriod.BI_WEEKLY);
	
	
	ExpenditureDTO dto3=new ExpenditureDTO();
	dto3.setPersonName("Mani");
	dto3.setSpentOn("HTML");
	dto3.setAmount(12000);
	dto3.setTax(15);
	dto3.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
	
	ExpenditureDTO dto4=new ExpenditureDTO();
	dto4.setPersonName("Megha");
	dto4.setSpentOn("voice");
	dto4.setAmount(15000);
	dto4.setTax(12);
	dto4.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
	
	ExpenditureDTO dto5=new ExpenditureDTO();
	dto5.setPersonName("Kasturi");
	dto5.setSpentOn("laptop");
	dto5.setAmount(35000);
	dto5.setTax(20);
	dto5.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	ExpenditureDTO dto6=new ExpenditureDTO();
	dto6.setPersonName("Neelesh");
	dto6.setSpentOn("Mobile");
	dto6.setAmount(25000);
	dto6.setTax(25);
	dto6.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
	
	ExpenditureDTO dto7=new ExpenditureDTO();
	dto7.setPersonName("sneha");
	dto7.setSpentOn("netWork");
	dto7.setAmount(5000);
	dto7.setTax(5);
	dto7.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	ExpenditureDTO dto8=new ExpenditureDTO();
	dto8.setPersonName("Mani");
	dto8.setSpentOn("HTML");
	dto8.setAmount(12000);
	dto8.setTax(15);
	dto8.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
	
	
	ExpenditureDTO dto9=new ExpenditureDTO();
	dto9.setPersonName("Shankar");
	dto9.setSpentOn("NetWork");
	dto9.setAmount(40000);
	dto9.setTax(15);
	dto9.setExpenditurePeriod(ExpenditurePeriod.DAILY);
	
	ExpenditureDTO dto10=new ExpenditureDTO();
	dto10.setPersonName("vignesh");
	dto10.setSpentOn("Dialogue");
	dto10.setAmount(20000);
	dto10.setTax(15);
	dto10.setExpenditurePeriod(ExpenditurePeriod.DAILY);
	
	ExpenditureDTO dto11=new ExpenditureDTO();
	dto11.setPersonName("Swapnil");
	dto11.setSpentOn("Sim");
	dto11.setAmount(999);
	dto11.setTax(30);
	dto11.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	ExpenditureDTO dto12=new ExpenditureDTO();
	dto12.setPersonName("Madhu");
	dto12.setSpentOn("voice");
	dto12.setAmount(30000);
	dto12.setTax(5);
	dto12.setExpenditurePeriod(ExpenditurePeriod.TWO_YEAR);
	
	ExpenditureDTO dto13=new ExpenditureDTO();
	dto13.setPersonName("Raj");
	dto13.setSpentOn("apple");
	dto13.setAmount(100000);
	dto13.setTax(15);
	dto13.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
	
	ExpenditureDTO dto14=new ExpenditureDTO();
	dto14.setPersonName("Praveen");
	dto14.setSpentOn("EarPhone");
	dto14.setAmount(150);
	dto14.setTax(3);
	dto14.setExpenditurePeriod(ExpenditurePeriod.TWO_YEAR);
	
	ExpenditureDTO dto15=new ExpenditureDTO();
	dto15.setPersonName("Preetam");
	dto15.setSpentOn("bike");
	dto15.setAmount(250000);
	dto15.setTax(15);
	dto15.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	ExpenditureDTO dto16=new ExpenditureDTO();
	dto16.setPersonName("chandan");
	dto16.setSpentOn("games");
	dto16.setAmount(25000);
	dto16.setTax(20);
	dto16.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	
	ExpenditureDTO dto17=new ExpenditureDTO();
	dto17.setPersonName("Bhim");
	dto17.setSpentOn("book");
	dto17.setAmount(1000);
	dto17.setTax(20);
	dto17.setExpenditurePeriod(ExpenditurePeriod.TWO_YEAR);
	
	ExpenditureDTO dto18=new ExpenditureDTO();
	dto18.setPersonName("govind");
	dto18.setSpentOn("EarBuds");
	dto18.setAmount(2000);
	dto18.setTax(18);
	dto18.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
	
	ExpenditureDTO dto19=new ExpenditureDTO();
	dto19.setPersonName("rani");
	dto19.setSpentOn("neckLace");
	dto19.setAmount(250000);
	dto19.setTax(30);
	dto19.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
	
	ExpenditureDTO dto20=new ExpenditureDTO();
	dto20.setPersonName("prem");
	dto20.setSpentOn("Pen");
	dto20.setAmount(1000);
	dto20.setTax(10);
	dto20.setExpenditurePeriod(ExpenditurePeriod.DAILY);
	
	
	dao.create(dto1);
	dao.create(dto2);
	dao.create(dto3);
	dao.create(dto4);
	dao.create(dto5);
	dao.create(dto6);
	dao.create(dto7);
	dao.create(dto8);
	dao.create(dto9);
	dao.create(dto10);
	dao.create(dto11);
	dao.create(dto12);
	dao.create(dto13);
	dao.create(dto14);
	dao.create(dto15);
	dao.create(dto16);
	dao.create(dto17);
	dao.create(dto18);
	dao.create(dto19);
	dao.create(dto20);
	
	
	}
}
