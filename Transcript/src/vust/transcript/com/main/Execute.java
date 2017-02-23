package vust.transcript.com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import vust.transcript.com.data.*;

public class Execute {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://166.63.123.163/vust_application?user=vustus_vustus&password=Temp1233");
			
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from database-name.table-name");
			writeResultSet(resultSet);
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	private void writeResultSet(ResultSet resultSet) throws SQLException {
		while(resultSet.next()) {
			String user = resultSet.getString("myuser");
			String website = resultSet.getString("webpage");
			String summary = resultSet.getString("summary");
			Date date = resultSet.getDate("datum");
			String comment = resultSet.getString("comments");
			System.out.println("User: " + user);
		}
	}
	public void close() {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(statement != null) {
				statement.close();
			}
			if(connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			System.out.println("Error closing: " + e.getMessage());
		}
	}
	
	public static void main(String args[]) {
		this.readDataBase();
	}
}
