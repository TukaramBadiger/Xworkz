package com.xworkz.databaseConnect.athlete.connection;

import static com.xworkz.databaseConnect.athlete.constants.MysqlProperties.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBUtilities {
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL.getVal(),USERNAME.getVal(),PASSWORD.getVal());
	
	}

}
