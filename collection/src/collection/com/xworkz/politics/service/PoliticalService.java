package collection.com.xworkz.politics.service;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalService {
	
void ValidateAndSave(PoliticalPartyDTO dto);
void deleteByName(String name);
	




}
