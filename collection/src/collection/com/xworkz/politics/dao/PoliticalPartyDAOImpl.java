package collection.com.xworkz.politics.dao;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

public class PoliticalPartyDAOImpl implements PoliticalPartyDAO {

     private int index=0;	
	List<PoliticalPartyDTO> list = new LinkedList<PoliticalPartyDTO>();

	public PoliticalPartyDAOImpl() {
		System.out.println("created ".concat(this.getClass().getSimpleName()));
	}

	@Override
	public boolean save(PoliticalPartyDTO dto) {
		
		list.add(dto);
		System.out.println(list.get(index));
		index++;
		return true;
	}

	public void display() {
		System.out.println(list);
	}

	@Override
	public PoliticalPartyDTO deleteByName(String name) {
		//System.out.println(list.size());
		if (name != null) {
			
		ListIterator<PoliticalPartyDTO> itrt = list.listIterator();
		
		while (itrt.hasNext()) {
			
			PoliticalPartyDTO dto = (PoliticalPartyDTO) itrt.next();
		if (dto.getName().equals(name)) {
			itrt.remove();
			System.out.println(list.size());
			System.out.println("the deleting name is "+name);

			}
			}
		}

		
		return null;
		
		
	}

	@Override
	public List<PoliticalPartyDTO> sort(Comparator<PoliticalPartyDTO> comparator) {
		if(comparator!=null) {
			list.sort(comparator);
			return list;
		}
		return null;
	}

	
	}


	

	

