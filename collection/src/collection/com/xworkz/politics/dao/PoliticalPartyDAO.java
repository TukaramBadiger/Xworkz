package collection.com.xworkz.politics.dao;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	public boolean save(PoliticalPartyDTO dto);
	public PoliticalPartyDTO deleteByName(String name);
	

}
