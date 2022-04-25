package collection.com.xworkz.politics;

import collection.com.xworkz.politics.dao.PoliticalPartyDAOImpl;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;
import collection.com.xworkz.politics.service.PoliticalService;

public class PoliticalpartyRunner {
	
	public static void main(String [] args) {
		PoliticalPartyDAOImpl PoliticalDAOs=new PoliticalPartyDAOImpl();
		PoliticalService service=new PoliticalService(PoliticalDAOs);
		PoliticalPartyDTO party=new PoliticalPartyDTO(003, "BSYs", "Modi", "BJP", 552);
		PoliticalPartyDTO party1=new PoliticalPartyDTO(004, "DKSs", "Modi", "INA", 552);
		PoliticalPartyDTO party2=new PoliticalPartyDTO(005, "HDKs", "Modi", "JNTDL", 552);
		//PoliticalPartyDTO party3=new PoliticalPartyDTO(006, "KSEs", "Modi", "BJP", 552);
		PoliticalDAOs.save(party);
		PoliticalDAOs.save(party1);
		PoliticalDAOs.save(party2);
	//PoliticalDAOs.save(party3);
		
		PoliticalDAOs.deleteByName("HDKs");
		
	
	System.out.println("remove method");
		PoliticalDAOs.deleteByName("HDKs");
	
	}

}
