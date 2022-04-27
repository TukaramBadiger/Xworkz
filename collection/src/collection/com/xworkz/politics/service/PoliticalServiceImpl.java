package collection.com.xworkz.politics.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dao.PoliticalPartyDAOImpl;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;
import collection.com.xworkz.politics.sorting.PoliticalPartyId;
import collection.com.xworkz.politics.sorting.PoliticalPartyNameAndId;
import collection.com.xworkz.politics.sorting.PoliticalPartybyName;

public class PoliticalServiceImpl implements PoliticalService {

	private PoliticalPartyDAO dao;

	public PoliticalServiceImpl(PoliticalPartyDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void ValidateAndSave(PoliticalPartyDTO dto) {
		if (dto != null) {
			if ((dto.getName().length() > 3 && dto.getName().length() < 50) && dto.getId() > 0 && dto.getNoOfMps() > 0
					&& dto.getPresidentName().length() > 0 && dto.getNationalParty().length() > 0) {

				System.out.println("saving method");
				dao.save(dto);
			}

		}
	}

	@Override
	public void deleteByName(String name) {
		if (name != null) {
			
			System.out.println(dao.deleteByName(name));
		}

	}

	

	@Override
	public List<PoliticalPartyDTO> sortByName() {
		Comparator<PoliticalPartyDTO> sortName=new PoliticalPartybyName();
		

		return dao.sort(sortName);
	}

	@Override
	public List<PoliticalPartyDTO> sortById() {
        Comparator<PoliticalPartyDTO> sortId=new PoliticalPartyId();
		return dao.sort(sortId);
	}

	@Override
	public List<PoliticalPartyDTO> sortByNameAndId() {
Comparator<PoliticalPartyDTO>sortNameandId=new PoliticalPartyNameAndId();
		return dao.sort(sortNameandId);
	}
}