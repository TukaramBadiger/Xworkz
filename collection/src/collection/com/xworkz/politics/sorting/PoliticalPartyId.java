package collection.com.xworkz.politics.sorting;

import java.util.Comparator;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyId implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {
        Integer id1=o1.getId();
        Integer id2=o2.getId();
        
		return  id1.compareTo(id2);
		
	}

	

}
