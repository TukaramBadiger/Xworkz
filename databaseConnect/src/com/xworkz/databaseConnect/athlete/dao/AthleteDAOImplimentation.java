package com.xworkz.databaseConnect.athlete.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection;
import com.xworkz.databaseConnect.athlete.connection.DBUtilities;
import com.xworkz.databaseConnect.athlete.constants.SPORTS;
import com.xworkz.databaseConnect.athlete.dao.AthleteDAO;
import com.xworkz.databaseConnect.athlete.dto.AthleteDTO;

public class AthleteDAOImplimentation implements AthleteDAO {

	@Override
	public boolean save(AthleteDTO dto) {
		String insertQuery = "insert into Athlete{name,sport,noOfGames,country,level,olympian,age,retired,coachName,totalMedals,fit,salary) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection sqlConnection = DBUtilities.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(insertQuery)) {
			return setDTOTOPreparedStatement(dto, preparedStatement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	private boolean setDTOTOPreparedStatement(AthleteDTO dto, PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.setString(1, dto.getName());
		preparedStatement.setString(2, dto.getSports().toString());
		preparedStatement.setInt(3, dto.getNoOfGames());
		preparedStatement.setString(4, dto.getCountry());
		preparedStatement.setInt(5, dto.getLevel());
		preparedStatement.setBoolean(6, dto.isOlympics());
		preparedStatement.setInt(7, dto.getAge());
		preparedStatement.setBoolean(8, dto.isRetired());
		preparedStatement.setString(9, dto.getCoachName());
		preparedStatement.setInt(10, dto.getTotalMedals());
		preparedStatement.setBoolean(11, dto.isFit());
		preparedStatement.setDouble(12, dto.getSalary());

		int rowAffected = preparedStatement.executeUpdate();
		System.out.printf("Row affected are>0", rowAffected);
		return true;
	}

	@Override
	public boolean saveList(List<AthleteDTO> list) {

		String insertQuery = "insert into athlete(name,sport,noOfGames,country,level,olympian,age,retired,coachName,totalMedals,fit,salary) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Iterator<AthleteDTO> itr = list.iterator();

		try {
			Connection sqlConnection = DBUtilities.getConnection();
			PreparedStatement preparedStatement = sqlConnection.prepareStatement(insertQuery);

			while (itr.hasNext()) {
				AthleteDTO dto = itr.next();
				return setDTOTOPreparedStatement(dto, preparedStatement);
			}
		}

		catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

	public AthleteDTO findById(int id) {
		String mySql = "Select * from athlete_Detais where id=?";

		try {
			Connection connection = DBUtilities.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(mySql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String sports = resultSet.getString(3).toString();
				int noOfGames = resultSet.getInt(4);
				String country = resultSet.getString(5);
				int level = resultSet.getInt(6);
				boolean olympics = resultSet.getBoolean(7);
				int age = resultSet.getInt(8);
				boolean retired = resultSet.getBoolean(9);
				String coachName = resultSet.getString(10);
				int totalMedals = resultSet.getInt(11);
				boolean fit = resultSet.getBoolean(12);
				double salary = resultSet.getDouble(13);
				AthleteDTO dto = new AthleteDTO(id1, name, sports, noOfGames, country, level, olympics, age, retired,coachName, totalMedals, fit, salary) ;
				return dto;
				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public Optional<AthleteDTO> findBYNameAndId(String name, int id) {
		String selectQuery="Select* from athlete where name=? and id=?";
		
		try {
			Connection sqlConnection=DBUtilities.getConnection();
			PreparedStatement preparedStatement=sqlConnection.prepareStatement(selectQuery);
			preparedStatement.setString(01, name);
			preparedStatement.setInt(id, 2);
			ResultSet resultSet=preparedStatement.executeQuery();
			  
			
			while(resultSet.next()) {
				return Optional.empty();		
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return Optional.empty();
	}

	

	

	@Override
	public Optional<AthleteDTO> findByNameAndSports(String name, String sports) {
		String selectQuery="Select* from athlete where name=? and sports=?";

		try {
			Connection connection=DBUtilities.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, sports);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
			
				return Optional.empty();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Optional<AthleteDTO> findByNameAndCountryAndSports(String name, String country, String sports) {
		String selectQuery="Select* from athlete where name=? and country=? and sports=?";
Connection connection;
try {
	connection = DBUtilities.getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, country);
	preparedStatement.setString(3, sports);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		return Optional.empty();
	}
	

}catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		return null;
	}



   @Override
	public Optional<AthleteDTO> findCoachNameByNameAndCountryAndSport(String name, String country, String sports) {
	
		String selectQuery = " Select coachName from athlete where name=? and country=? and sport=?";

		try (Connection sqlConnection = DBUtilities.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)){
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, country);
			preparedStatement.setString(3, sports);

			ResultSet resultSet = preparedStatement.executeQuery();

			resultSet.next();

			return Optional.empty();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}

    @Override
	public Optional<String> findNameByID(int id) {
		String selectQuery = " Select name from athlete where id=?";

		try (Connection sqlConnection = DBUtilities.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setInt(3, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			

			return Optional.of(resultSet.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}
    @Override
    public Optional<Integer> findIDByName(String name) {
		String selectQuery = " Select id from athlete where name=?";

		try (Connection sqlConnection = DBUtilities.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			return Optional.of(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();

	}

	

}