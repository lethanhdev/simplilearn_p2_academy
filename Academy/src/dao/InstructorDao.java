package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import model.Instructor;

public class InstructorDao {

    public int addInstructor(Instructor instructor) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO instructor " +
            "  (firstName, lastName, username, password, address, contact) VALUES " +
            " (?, ?, ?, ?, ?, ?);";


        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/academydb?useSSL=false", "root", "cmajor77");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            //preparedStatement.setInt(1, 1);

            preparedStatement.setString(1, instructor.getFirstName());
            preparedStatement.setString(2, instructor.getLastName());
            preparedStatement.setString(3, instructor.getUsername());
            preparedStatement.setString(4, instructor.getPassword());
            preparedStatement.setString(5, instructor.getAddress());
            preparedStatement.setString(6, instructor.getContact());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }
    

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}