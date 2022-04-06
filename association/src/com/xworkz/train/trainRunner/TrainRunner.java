package com.xworkz.train.trainRunner;

import com.xworkz.train.constatnt.TrainType;
import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dao.TrainDAOImplement;
import com.xworkz.train.dto.TrainDTO;

public class TrainRunner {

	
	public static void main(String[] args) {

		TrainDAO trainDAO = new TrainDAOImplement();

		TrainDTO trainDTO1 = new TrainDTO();

		trainDTO1.setID("TRAIN_1");
		trainDTO1.setTrainNumber("16535");
		trainDTO1.setTrainType(TrainType.PASSENGER);
		trainDTO1.setTrainName("GolGumbaz express");
		trainDTO1.setStartingPoint("Bengaluru");
		trainDTO1.setDestinationPoint("Bijapura");

		TrainDTO trainDTO2 = new TrainDTO();

		trainDTO2.setID("TRAIN_2");
		trainDTO2.setTrainNumber("12027");
		trainDTO2.setTrainType(TrainType.PASSENGER);
		trainDTO2.setTrainName("Shatadbi express");
		trainDTO2.setStartingPoint("Bengaluru");
		trainDTO2.setDestinationPoint("Chennai");

		TrainDTO trainDTO3 = new TrainDTO();

		trainDTO3.setID("TRAIN_3");
		trainDTO3.setTrainNumber("12080");
		trainDTO3.setTrainType(TrainType.EXPRESS);
		trainDTO3.setTrainName("Jan Shatabdi");
		trainDTO3.setStartingPoint("Bengaluru");
		trainDTO3.setDestinationPoint("Hubli");

		TrainDTO trainDTO4 = new TrainDTO();

		trainDTO4.setID("TRAIN_4");
		trainDTO4.setTrainNumber("12296");
		trainDTO4.setTrainType(TrainType.GOODS);
		trainDTO4.setTrainName("Sangamitra express");
		trainDTO4.setStartingPoint("Bengaluru");
		trainDTO4.setDestinationPoint("Patna");

		TrainDTO trainDTO5 = new TrainDTO();

		trainDTO5.setID("TRAIN-5");
		trainDTO5.setTrainNumber("12608");
		trainDTO5.setTrainType(TrainType.ARMY);
		trainDTO5.setTrainName("Lalbag express");
		trainDTO5.setStartingPoint("Chennai");
		trainDTO5.setDestinationPoint("Bangalore");

		TrainDTO trainDTO6 = new TrainDTO();

		trainDTO6.setID("TRAIN-6");
		trainDTO6.setTrainNumber("16536");
		trainDTO6.setTrainType(TrainType.EXPRESS);
		trainDTO6.setTrainName("Bagalkot express");
		trainDTO6.setStartingPoint("Bengaluru");
		trainDTO6.setDestinationPoint("Bagalkot");

		TrainDTO trainDTO7 = new TrainDTO();

		trainDTO7.setID("TRAIN_7");
		trainDTO7.setTrainNumber("12613");
		trainDTO7.setTrainType(TrainType.PASSENGER);
		trainDTO7.setTrainName("Tippu express");
		trainDTO7.setStartingPoint("Bengaluru");
		trainDTO7.setDestinationPoint("Mysuru");

		TrainDTO trainDTO8 = new TrainDTO();

		trainDTO8.setID("TRAIN-8");
		trainDTO8.setTrainNumber("126271");
		trainDTO8.setTrainType(TrainType.EXPRESS);
		trainDTO8.setTrainName("Karnataka express");
		trainDTO8.setStartingPoint("Bengaluru");
		trainDTO8.setDestinationPoint("NewDelhi");

		TrainDTO trainDTO9 = new TrainDTO();

		trainDTO9.setID("TRAIN-9");
		trainDTO9.setTrainNumber("12677");
		trainDTO9.setTrainType(TrainType.GOODS);
		trainDTO9.setTrainName("Ernakullam express");
		trainDTO9.setStartingPoint("Bengaluru");
		trainDTO9.setDestinationPoint("Ernakullam");

		TrainDTO trainDTO10 = new TrainDTO();

		trainDTO10.setID("TRAIN-10");
		trainDTO10.setTrainNumber("12725");
		trainDTO10.setTrainType(TrainType.EXPRESS);
		trainDTO10.setTrainName("Siddhaganga express");
		trainDTO10.setStartingPoint("Bengaluru");
		trainDTO10.setDestinationPoint("Dharwad");

		trainDAO.createDTO(trainDTO1);
		trainDAO.createDTO(trainDTO2);
		trainDAO.createDTO(trainDTO3);
		trainDAO.createDTO(trainDTO4);
		trainDAO.createDTO(trainDTO5);
		trainDAO.createDTO(trainDTO6);
		trainDAO.createDTO(trainDTO7);
		trainDAO.createDTO(trainDTO8);
		trainDAO.createDTO(trainDTO9);
		trainDAO.createDTO(trainDTO10);

		TrainDTO trainDTOUpdate = new TrainDTO();

		trainDTOUpdate.setID("TRAIN-12");
		trainDTOUpdate.setTrainNumber("13526");
		trainDTOUpdate.setTrainType(TrainType.EXPRESS);
		trainDTOUpdate.setTrainName("MP express");
		trainDTOUpdate.setStartingPoint("Bengaluru");
		trainDTOUpdate.setDestinationPoint("MP");

		System.out.println("");

		trainDAO.findByTrainNumber("16535");
		trainDAO.findByTrainName("GolGumbaz express");
		trainDAO.findByStartingAndDestination("Bengaluru", "Bijapura");

		int total = trainDAO.totalTrains();
		System.out.println("The total number of trains in array is " + total);

		TrainDAOImplement castedTriainDAOImplement = (TrainDAOImplement) trainDAO;

		castedTriainDAOImplement.updateByTrainName("Shatabdi express", trainDTOUpdate);
		
		
		System.out.println("Before delete " + castedTriainDAOImplement.totalTrains());
		castedTriainDAOImplement.deleteByTrainName("MP express");

		System.out.println("After delete " + castedTriainDAOImplement.totalTrains());
		
		TrainDTO[] superArray = castedTriainDAOImplement.getTrainDTOs();
		
		System.out.println(superArray[8]);

	



	
	
	
	}
}
