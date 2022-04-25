package collection.com.xworkz.collection.washingMachine;

import java.util.Collection;
import java.util.LinkedList;

import collection.com.xworkz.collection.washingMachine.constants.WashingMachineType;
import collection.com.xworkz.collection.washingMachine.dto.WashingMachineDTO;

public class WashingMachineRunner {
	public static void main(String[] args) {
	
	
		WashingMachineDTO washingmachineDTO=new WashingMachineDTO(51, "LG-WASHINGMACHINE", "WT5101HV", "White", WashingMachineType.FRONT, 5000d, 5);
		WashingMachineDTO washingmachineDTO1=new WashingMachineDTO(52, "IFB-WASHINGMACHINE", "WT502HV", "Red", WashingMachineType.TOP, 4000d, 6);
		WashingMachineDTO washingmachineDTO2=new WashingMachineDTO(53, "Samsung-WASHINGMACHINE", "WT5103HV", "Gray", WashingMachineType.FRONT, 3000d, 7);
		WashingMachineDTO washingmachineDTO3=new WashingMachineDTO(54, "Haier", "WT5104HV", "Silver", WashingMachineType.FRONT, 2000d, 3);
		WashingMachineDTO washingmachineDTO4=new WashingMachineDTO(55, "Whirlpool", "WT505HV", "White", WashingMachineType.TOP, 1000d, 11);
		WashingMachineDTO washingmachineDTO5=new WashingMachineDTO(56, "BOSH", "WT5106HV", "Blue", WashingMachineType.FRONT, 2500d, 2);
		WashingMachineDTO washingmachineDTO6=new WashingMachineDTO(57, "Panasonic", "WT5107HV", "pink", WashingMachineType.TOP, 3000d, 4);
		WashingMachineDTO washingmachineDTO7=new WashingMachineDTO(58, "Godrej-WASHINGMACHINE", "WT108HV", "White", WashingMachineType.TOP, 3500d, 5);
		WashingMachineDTO washingmachineDTO8=new WashingMachineDTO(59, "Onida", "WT5109HV", "Black", WashingMachineType.FRONT, 5500d, 5);
		WashingMachineDTO washingmachineDTO9=new WashingMachineDTO(511, "FIELE", "WT010HV", "Orange", WashingMachineType.FRONT, 6000d, 16);
		WashingMachineDTO washingmachineDTO10=new WashingMachineDTO(512, "AEG-WASHINGMACHINE", "WT51011HV", "Green", WashingMachineType.TOP, 6500d, 6);
		WashingMachineDTO washingmachineDTO11=new WashingMachineDTO(513, "Amana", "WT51021HV", "Yellow", WashingMachineType.FRONT, 7000d, 7);
		WashingMachineDTO washingmachineDTO12=new WashingMachineDTO(514, "Admiral", "WT1031HV", "sky-Blue", WashingMachineType.TOP, 7500d, 18);
		WashingMachineDTO washingmachineDTO13=new WashingMachineDTO(515, "Whirlpool", "WT510561HV", "White", WashingMachineType.FRONT, 8000d, 9);
		WashingMachineDTO washingmachineDTO14=new WashingMachineDTO(516, "Speed Queen", "WT1781HV", "Gray", WashingMachineType.FRONT, 8500d, 15);
		WashingMachineDTO washingmachineDTO15=new WashingMachineDTO(517, "Videocon", "WT510190HV", "Red", WashingMachineType.TOP, 9000d, 14);
		WashingMachineDTO washingmachineDTO16=new WashingMachineDTO(518, "HOTPOINT-WASHINGMACHINE", "WT745101HV", "Dark-pink", WashingMachineType.TOP, 95000d, 13);
		WashingMachineDTO washingmachineDTO17=new WashingMachineDTO(519, "Kenmonre", "WT510891HV", "White", WashingMachineType.FRONT, 2500d, 22);
		WashingMachineDTO washingmachineDTO18=new WashingMachineDTO(520, "Maytag", "WT510106HV", "Voilet", WashingMachineType.FRONT, 1000d, 11);
		WashingMachineDTO washingmachineDTO19=new WashingMachineDTO(521, "SIEMENS-WASHINGMACHINE", "WT510123HV", "Green", WashingMachineType.TOP, 2000d, 15);
	
	Collection<WashingMachineDTO> wmd=new LinkedList<>();
	wmd.add(washingmachineDTO);
	wmd.add(washingmachineDTO1);
	wmd.add(washingmachineDTO2);
	wmd.add(washingmachineDTO3);
	wmd.add(washingmachineDTO4);
	wmd.add(washingmachineDTO5);
	wmd.add(washingmachineDTO6);
	wmd.add(washingmachineDTO7);
	wmd.add(washingmachineDTO8);
	wmd.add(washingmachineDTO9);
	wmd.add(washingmachineDTO10);
	wmd.add(washingmachineDTO11);
	wmd.add(washingmachineDTO12);
	wmd.add(washingmachineDTO13);
	wmd.add(washingmachineDTO14);
	wmd.add(washingmachineDTO15);
	wmd.add(washingmachineDTO16);
	wmd.add(washingmachineDTO17);
	wmd.add(washingmachineDTO18);
	wmd.add(washingmachineDTO19);
	
	System.out.println("Total Washing Machines " + wmd.size());
	System.out.println("================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		System.out.println(wmdto);
	}
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		if(wmdto.getPrice()<5000 ) 
		{
		     System.out.println("Washing Machine price are greater than 5000 : "+ ""+ wmdto);
		     
		}

	}
	System.out.println("======================================================================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getPrice()>5000) 
		{
			System.out.println("Washing Machine price are leeser than 5000 :" + "" +wmdto);
		}
	}
	
	System.out.println("======================================================================================================");
		
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getCapacity()>5) 
		{
		System.out.println("Washing Machine capacity is greater than 5kg :" + "" +wmdto);
		}
	}
	System.out.println("======================================================================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getCapacity()>5 &&  wmdto.getCapacity()<15) 
		{
		System.out.println("Washing Machine capacity is greater than 5kg and lesser than 15 :" + "" +wmdto);
		}
	}
	
	System.out.println("======================================================================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getCapacity()>15) 
		{
		System.out.println("Washing Machine capacity is greater than 15kg :" + "" +wmdto);
		}
	}
	
	System.out.println("======================================================================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getBrand()=="F") 
		{
		System.out.println("Washing Machine has F in it :"+ wmdto);
		}
		
	}
	System.out.println("======================================================================================================");
	
	for(WashingMachineDTO wmdto:wmd) 
	{
		
		if(wmdto.getBrand().toUpperCase()!=null) 
		{
	            System.out.println("Washing Machine brand name are in Upper case : " + wmdto);
		}
		
	}
		
	}
	
	

}
