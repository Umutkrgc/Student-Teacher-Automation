package ogrenci_ogretmen_uygulama;

import java.sql.*;

public class MysqlHandler {

	private String host = "127.0.0.1";
	private String username = "root";
	private String password = "";
	private String DatabaseName = "stdmgdb";
	// private int port = 3306;

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	@SuppressWarnings("deprecation")
	public MysqlHandler() {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			// register MySQL Connector/J
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.out.println("Failed to register MySQL Connector/J");
			return;
		}
	}

	public void connect() {
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://" + host + "/" + DatabaseName + "?user=" + username + "&password=" + password);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return;
		}
	}
	
	public void insertData(String query, Object[] params) {
		
	}
}
