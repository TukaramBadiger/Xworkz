package collection.com.xworkz.politics;

import java.util.List;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dao.PoliticalPartyDAOImpl;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;
import collection.com.xworkz.politics.service.PoliticalService;
import collection.com.xworkz.politics.service.PoliticalServiceImpl;

public class PoliticalpartyRunner {
	
	public static void main(String [] args) {
		PoliticalPartyDAO PoliticalDAOs=new PoliticalPartyDAOImpl();
		
		
		PoliticalService service=new PoliticalServiceImpl(PoliticalDAOs);
		
		
		
		PoliticalPartyDTO party=new PoliticalPartyDTO(006, "BSYs", "Modi", "BJPs", 552);
		PoliticalPartyDTO party1=new PoliticalPartyDTO(004, "DKSs", "Modi", "INAs", 552);
		PoliticalPartyDTO party2=new PoliticalPartyDTO(005, "HDKs", "Modi", "JNTDLs", 552);
		//PoliticalPartyDTO party3=new PoliticalPartyDTO(006, "KSEs", "Modi", "BJP", 552);
		
		
		System.out.println("valid and save");
		
		service.ValidateAndSave(party2);
		service.ValidateAndSave(party1);
		service.ValidateAndSave(party);
		
		
		System.out.println("===");
	
	  

		List<PoliticalPartyDTO> sorted1=service.sortById();
		System.out.println(sorted1);
		
		List<PoliticalPartyDTO> sorted=service.sortByName();
		System.out.println(sorted);
		
		List<PoliticalPartyDTO> sorted2=service.sortByNameAndId();
		System.out.println(sorted2);
	
	    System.out.println("remove method");
	
		
	//	PoliticalPartyDAO impl=new PoliticalPartyDAOImpl();
	//	impl.deleteByName("HDKs");
		//impl.deleteByName("BSYs");
		
		
		System.out.println("validateing delete method");
		service.deleteByName("BSYs");
		
		
	    
		
		
	}

}
