package com.xworkz.databaseConnect.athlete.dao;

import java.util.List;
import java.util.Optional;

import com.xworkz.databaseConnect.athlete.constants.SPORTS;
import com.xworkz.databaseConnect.athlete.dto.AthleteDTO;

public interface AthleteDAO {

	boolean save(AthleteDTO dto);
	
	boolean saveList(List<AthleteDTO> list);
	
	default AthleteDTO findById(int id) {
		return null;
	}

	default Optional<AthleteDTO> findBYNameAndId(String name,int id){
		return null;
	}
		
	
	 default Optional<AthleteDTO> findByNameAndSports(String name,String sports){
		 return null;
	 }
	
	default Optional<AthleteDTO> findByNameAndCountryAndSports(String name,String country,String sports){
		return null;
	}
	
	default Optional<AthleteDTO> findCoachNameByNameAndCountryAndSport(String name, String country, String sports){
		return null;
	}
	
	default Optional<Integer> findIDByName(String name){
		return null;
	}

	default Optional<String> findNameByID(int id){
		return null;
	}

}
