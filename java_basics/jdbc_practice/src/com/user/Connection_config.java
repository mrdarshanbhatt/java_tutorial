package com.user;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Connection_config {

	public static Connection establishedConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/user", "root", "rootroot");
		return connection;
	}

	public static Object addUser(UserManagment user) throws Exception {

		// Connection Established
		Connection connection = establishedConnection();

		String insertQuery = "INSERT INTO user_table VALUES(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = (PreparedStatement) connection
				.prepareStatement(insertQuery);

		// set Dynamic Parameter
		preparedStatement.setString(1, user.getFirstName());
		preparedStatement.setString(2, user.getLastName());
		preparedStatement.setString(3, user.getPassword());
		preparedStatement.setString(4, user.getDob());
		preparedStatement.setString(5, user.getEmail());
		preparedStatement.setString(6, user.getUserName());
		// Execute Query
		preparedStatement.executeUpdate();
		connection.close();
		return "User added.";
	}

	public static Object updateUser(UserManagment user) throws Exception {

		Connection connection = establishedConnection();
		PreparedStatement preparedStatement = (PreparedStatement) connection
				.prepareStatement("UPDATE user_table SET firstName=?,lastName=?,password=?,userName=?,doc=? where email=?");

		preparedStatement.setString(1, user.getFirstName());
		preparedStatement.setString(2, user.getLastName());
		preparedStatement.setString(3, user.getPassword());
		preparedStatement.setString(4, user.getUserName());
		preparedStatement.setString(5, user.getDob());
		preparedStatement.setString(6, user.getEmail());
		preparedStatement.executeUpdate();
		return "User Updated.";

	}

	public static void deleteUser(String email) throws Exception {
		Connection connection = establishedConnection();

		Statement statement = connection.createStatement();
		statement.executeUpdate("DELETE FROM user_table where email ='"
				+ email + "'");
	}

	public static LinkedList getAllUser() throws Exception {

		Connection connection = establishedConnection();

		PreparedStatement preparedStatement = (PreparedStatement) connection
				.prepareStatement("SELECT * FROM user_table");

		preparedStatement.setInt(1, 3);
		UserManagment managment = new UserManagment();
		ResultSet re = preparedStatement.executeQuery();

		// for Fast Performance
		LinkedList linkedList = new LinkedList();
		while (re.next()) {
			managment.setFirstName(re.getString("firstName"));
			managment.setLastName(re.getString("lastName"));
			managment.setEmail(re.getString("email"));
			managment.setPassword(re.getString("password"));
			managment.setUserName(re.getString("userName"));
			managment.setDob(re.getString("dob"));
			linkedList.add(managment);
		}
		return linkedList;
	}

	public static void main(String[] args) throws Exception {

		UserManagment managment = new UserManagment();
		// addUser(managment);
		// updateUser(managment);
		// deleteUser(managment);
		// managment = (UserManagment) readUserData(managment);
	}
}
