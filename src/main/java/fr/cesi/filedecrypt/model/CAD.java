package fr.cesi.filedecrypt.model;

import java.sql.*;

/**
 * Couche d'accès au données
 */
public class CAD {

    private String url = "jdbc:mysql://localhost:3306/FileDecrypt?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    private String login = "root";
    private String password = "root";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    /**
     * Constructor
     */
    public CAD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Perform SELECT SQL request
     * @param rqt
     * @return data
     */
    public ResultSet getRows(String rqt) {
        ResultSet result = null;
        try {
            //statement = connection.prepareCall(rqt);
            this.statement = connection.createStatement();
            statement.executeQuery(rqt);
            result = statement.getResultSet();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    /**
     * Perform TABLE UPDATE SQL request
     * @param rqt
     * @return success state
     */
    public boolean actionRows(String rqt) {
        try {
            this.statement = connection.createStatement();
            this.statement.executeUpdate(rqt);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
