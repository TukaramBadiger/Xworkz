package collection.com.xworkz.politics.service;

import collection.com.xworkz.politics.dao.PoliticalPartyDAO;
import collection.com.xworkz.politics.dto.PoliticalPartyDTO;

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
			dao.deleteByName("HDKs");
		}

	}
}