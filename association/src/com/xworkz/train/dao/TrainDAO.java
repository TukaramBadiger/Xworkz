package com.xworkz.train.dao;

import com.xworkz.train.dto.TrainDTO;

public abstract class TrainDAO {


	private TrainDTO[] trainDTOs = new TrainDTO[10];
	private int counter = 0;

	public TrainDAO() {
		System.out.println("Created TrainDAO");
	}

	public TrainDTO[] getTrainDTOs() {
		return trainDTOs;
	}

	public void createDTO(TrainDTO trainDTO) {
		if (trainDTO == null) {
			System.err.println("No trainDTO is passed");
			return;
		}
		boolean found = findDuplicate(trainDTO);
		if (found) {
			System.err.println("The train DTO is not added to array list as it is a dupliacte");
			return;
		}
		if (this.counter < this.trainDTOs.length) {
			this.trainDTOs[counter] = trainDTO;
			System.out.println("TrainDTO has been added to index @ " + this.counter);
			counter++;
		} else {
			System.err.println("TrainDTO is out of bounds cannot b added to DTO array list");
		}
	}

	public boolean findDuplicate(TrainDTO trainDTO) {
		if (trainDTO == null) {
			System.out.println("Added DTO is null and cannot be found");
			return false;
		}
		for (int index = 0; index < this.trainDTOs.length; index++) {
			if (this.trainDTOs[index] != null && this.trainDTOs[index].equals(trainDTO)) {
				System.out.println("The added train DTO is found in the array @ DTO index " + index);
				return true;
			}
		}

		System.err.println("The trainDTO is not found in the array list");

		return false;
	}

	public TrainDTO findByTrainNumber(String number) {
		if (number == null) {
			System.err.println("No Train number is passed to find");
			return null;
		}
		for (int index = 0; index < this.trainDTOs.length; index++) {
			if (this.trainDTOs[index] != null && this.trainDTOs[index].getTrainNumber().equals(number)) {
				System.out.println("The Train number is found @ DTO index " + index);
				return this.trainDTOs[index];
			}
		}
		System.err.println("The Train number passed is not found in the DTO index list");
		return null;
	}

	public TrainDTO findByTrainName(String name) {
		if (name == null) {
			System.err.println("No Train name is passed to find");
			return null;
		}
		for (int index = 0; index < this.trainDTOs.length; index++) {
			if (this.trainDTOs[index] != null && this.trainDTOs[index].getTrainName().equals(name)) {
				System.out.println("The Train name is found @ DTO index " + index);
				return this.trainDTOs[index];
			}
		}
		System.err.println("The Train name passed is not found in the DTO index list");

		return null;
	}

	public TrainDTO findByStartingAndDestination(String startingPoint, String destinationPoint) {
		if (startingPoint == null || destinationPoint == null) {
			System.err.println("No Train starting or destination point is passed to find");
			return null;
		}
		for (int index = 0; index < this.trainDTOs.length; index++) {
			if (this.trainDTOs[index] != null && this.trainDTOs[index].getStartingPoint().equals(startingPoint)
					&& this.trainDTOs[index].getDestinationPoint().equals(destinationPoint)) {
				System.out.println("The Train starting and destination point is found @ DTO index " + index);
				return this.trainDTOs[index];
			}
		}
		System.err.println("The Train starting and destination point passed is not found in the DTO index list");

		return null;
	}

	public int totalTrains() {
		int trainCounter = 0;
		for (int index = 0; index < this.trainDTOs.length; index++) {
			if (this.trainDTOs[index] != null) {
				trainCounter++;
			}
		}
		return trainCounter;
	}

}