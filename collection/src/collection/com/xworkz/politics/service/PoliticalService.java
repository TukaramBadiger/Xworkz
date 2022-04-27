package collection.com.xworkz.politics.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public interface PoliticalService {
	
void ValidateAndSave(PoliticalPartyDTO dto);
void deleteByName(String name);
	
List<PoliticalPartyDTO> sortByName();

List<PoliticalPartyDTO> sortById();

List<PoliticalPartyDTO> sortByNameAndId();


}
