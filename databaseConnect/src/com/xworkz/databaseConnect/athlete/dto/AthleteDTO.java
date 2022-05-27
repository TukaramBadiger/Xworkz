package com.xworkz.databaseConnect.athlete.dto;

import java.io.Serializable;

import com.xworkz.databaseConnect.athlete.constants.SPORTS;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AthleteDTO implements Serializable{
	private int id;
	private String name;
	private String sports;
	private int noOfGames;
	private String country;
	private int level;
	private boolean olympics;
	private int age;
	private boolean retired;
	private String coachName;
	private int totalMedals;
	private boolean fit;
	private Double Salary;
	
	
	
	
	
	

}
