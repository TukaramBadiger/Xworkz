package collection.com.xworkz.politics.service;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalService {
	
private PoliticalPartyDAO dao;

	public PoliticalService(PoliticalPartyDAO dao) {
		super();
              this.dao=dao;
	}

void ValidateAndSave(PoliticalPartyDTO dto) {
	if(dto!=null) {
		if((dto.getName().length()>3 && dto.getName().length()<50) && dto.getId()>0 && dto.getNoOfMps()>0) {
			boolean sv=dao.save(dto);
		}
	}
}




}
