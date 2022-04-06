package com.xworkz.train.dto;

import com.xworkz.train.constatnt.TrainType;

public class TrainDTO {
	/*Manage Data of Train


	TrainDTO: id,number,type:enum,name,startingPoint, destination


	TrainDAO : create(TrainDTO dto), TrainDTO findByNumber(String number),TrainDTO findByName(String name), findByStartingPointAndDestination(String starting,String destination), int totalTrains();


	TrainDTO is duplicate if  number,type and name is same 

	Should allow max 10 trains only */
	
	
	
	private String iD;
	private String trainNumber;
	private TrainType trainType;
	private String trainName;
	private String startingPoint;
	private String destinationPoint;

	public TrainDTO() {
		System.out.println("Created Train DTO");
	}

	@Override
	public String toString() {
		return "TrainDTO [iD=" + iD + ", trainNumber=" + trainNumber + ", trainType=" + trainType + ", trainName="
				+ trainName + ", startingPoint=" + startingPoint + ", destinationPoint=" + destinationPoint + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TrainDTO)) {
			return false;
		}
		TrainDTO other = (TrainDTO) obj;
		if (trainName == null) {
			if (other.trainName != null) {
				return false;
			}
		} else if (!trainName.equals(other.trainName)) {
			return false;
		}
		if (trainNumber == null) {
			if (other.trainNumber != null) {
				return false;
			}
		} else if (!trainNumber.equals(other.trainNumber)) {
			return false;
		}
		if (trainType != other.trainType) {
			return false;
		}
		return true;
	}

	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		this.iD = iD;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public TrainType getTrainType() {
		return trainType;
	}

	public void setTrainType(TrainType trainType) {
		this.trainType = trainType;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

}