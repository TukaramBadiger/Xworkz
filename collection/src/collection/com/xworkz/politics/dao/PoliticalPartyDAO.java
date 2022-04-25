package collection.com.xworkz.politics.dao;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	
	boolean deleteByName(String name);
	boolean save(PoliticalPartyDTO dto);

}
