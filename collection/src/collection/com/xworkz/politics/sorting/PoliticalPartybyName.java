package collection.com.xworkz.politics.sorting;

import java.util.Comparator;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartybyName implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
