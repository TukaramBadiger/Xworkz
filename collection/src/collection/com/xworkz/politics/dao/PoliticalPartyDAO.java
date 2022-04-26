package collection.com.xworkz.politics.dao;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	boolean save(PoliticalPartyDTO dto);
	void deleteByName(String name);
	

}
