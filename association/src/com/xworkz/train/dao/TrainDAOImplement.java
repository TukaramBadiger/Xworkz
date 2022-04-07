package com.xworkz.train.dao;

import com.xworkz.train.dto.TrainDTO;

public class TrainDAOImplement extends TrainDAO {

  public void updateByTrainName(String trainName, TrainDTO trainDTOUpdate) {

  if (trainName != null && trainDTOUpdate != null) {

        TrainDTO[] superArray = super.getTrainDTOs();

  for (int index = 0; index < superArray.length; index++) {

		TrainDTO trainDTO = superArray[index];

  if (trainDTO != null && trainDTO.getTrainName().equals(trainName)) {

		System.out.println("Index to be updated is " + index);
		superArray[index] = trainDTOUpdate;
		}
		}
		}
	    }

	public void deleteByTrainName(String trainName) {
		if (trainName != null) {

			TrainDTO[] superArray = super.getTrainDTOs();

			for (int index = 0; index < superArray.length; index++) {

			TrainDTO trainDTO = superArray[index];

		if (trainDTO != null && trainDTO.getTrainName().equals(trainName)) {
					
			System.out.println("Index to be deleted is " + index);
			
			superArray[index] = null;

			}
			}
		    }
	        }

}
