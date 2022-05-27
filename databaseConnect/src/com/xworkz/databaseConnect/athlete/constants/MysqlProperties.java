package com.xworkz.databaseConnect.athlete.constants;

public enum MysqlProperties {
	URL("jdbc:musql://localhost:3306/Athlete"), USERNAME("root"), PASSWORD("TUkaram@1994");

	private String val;

	private MysqlProperties(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
}
