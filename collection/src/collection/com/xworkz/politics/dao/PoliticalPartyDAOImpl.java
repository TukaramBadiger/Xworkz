package collection.com.xworkz.politics.dao;

import java.util.LinkedList;
import java.util.List;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyDAOImpl implements PoliticalPartyDAO{
	
   List<PoliticalPartyDTO> party= new LinkedList<PoliticalPartyDTO>();
	
	private int index=0;

	@Override
	public boolean save(PoliticalPartyDTO dto) {
		
	System.out.println("save");
	party.add(index,dto);
	System.out.println(party.get(index));
	index++;
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("finding Name");
		for(int i=0;i<=party.size();i++) {
			if(party.get(i).getName().equals(name)) {
				System.out.println(party.get(i));
				party.remove(i);
			}
		}
		
		
		
		
		return false;
	}

	

}
