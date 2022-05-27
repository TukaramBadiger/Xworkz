package com.xworkz.databaseConnect.athlete.runner;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;

	import com.xworkz.databaseConnect.athlete.constants.SPORTS;
import com.xworkz.databaseConnect.athlete.dao.AthleteDAO;
	import com.xworkz.databaseConnect.athlete.dao.AthleteDAOImplimentation;
	import com.xworkz.databaseConnect.athlete.dto.AthleteDTO;

	public class AthleteRunner {

		public static void main(String[] args) {

			AthleteDTO dto = new AthleteDTO(01, "Michael Phelps", "SWIMMING", 4, "American", 2, true, 21, false, "Robert Bowmen", 3, true,30d);
	        AthleteDTO dto1 = new AthleteDTO(02, "Neeraj Chopra", "JAVALLIN_THROW", 6, "India", 5, false, 22, false, "Uwe Hohn", 3,true, 35d);
	        AthleteDTO dto2 = new AthleteDTO(03, "Ryan Crouser", "SHOT_PUT", 3, "American", 3, false, 23, false, "Ramesh", 4,true, 30d);
	        AthleteDTO dto3 = new AthleteDTO(04, "Usain Bolt", "RUNNING", 2, "Jamaica", 4, true, 18, false, "Shambu", 2, true,38d);
	        AthleteDTO dto4 = new AthleteDTO(05, "Mike Powell", "LONG_JUMP", 5, "America", 1, false, 22, false, "Krishna", 3,true, 40d);
	        AthleteDTO dto5 = new AthleteDTO(06, "Javier Sotomayor", "HIGH_JUMP", 8, "Cuba", 3, true, 23, false, "Ravi", 5, true,55d);

			List<AthleteDTO> list = new ArrayList();
			list.add(dto);
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);
			list.add(dto4);
			list.add(dto5);

			AthleteDAO dao = new AthleteDAOImplimentation();
			dao.saveList(list);

			AthleteDTO idDTO = dao.findById(2);
			System.out.println(idDTO);

			

			Optional<AthleteDTO> optionalDTO2 = dao.findBYNameAndId("Mike Powell", 5);
			if (optionalDTO2.isPresent()) {
				System.out.println(optionalDTO2.get());
			}

			Optional<AthleteDTO> optionalDTO3 = dao.findByNameAndCountryAndSports("Neeraj Chopra", "India", "JAVALLIN_THROW");
			if (optionalDTO3.isPresent()) {
				System.out.println(optionalDTO3.get());
			}

			Optional<AthleteDTO> optionalDTO4 = dao.findByNameAndSports("Usain Bolt", "RUNNING");
			if (optionalDTO4.isPresent()) {
				System.out.println(optionalDTO4.get());
			}

			Optional<AthleteDTO> optionalCoach = dao.findCoachNameByNameAndCountryAndSport("Michael Phelps", "American","Shotput");
			if (optionalCoach.isPresent()) {
				System.out.println(optionalCoach.get());
			}

			Optional<String> optionalName = dao.findNameByID( 6);
			if (optionalName.isPresent()) {
				System.out.println(optionalName.get());
			}

		Optional<Integer> optionalID = dao.findIDByName("Ryan Crouser");
			if (optionalID.isPresent()) {
				System.out.println(optionalID.get());
			
			
			
			}

		}
	}

	


