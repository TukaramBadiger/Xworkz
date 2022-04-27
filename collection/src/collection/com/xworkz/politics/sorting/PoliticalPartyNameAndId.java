package collection.com.xworkz.politics.sorting;

import java.util.Comparator;

import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyNameAndId implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {

		 Integer id=o1.getId();
		 Integer id2=o2.getId();
		 
		 
		 
		 return ((id.compareTo(id2)+(o1.getName().compareTo(o2.getName()))));
	}
	

}
