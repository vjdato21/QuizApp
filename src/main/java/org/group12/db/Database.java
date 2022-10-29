package org.group12.db;

import java.sql.*;

public class Database {
    private static Connection ct = null;

    public static Connection getDBConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            ct = DriverManager.getConnection("jdbc:sqlite:quizapp.db");
        } catch(ClassNotFoundException cnfExc) {
            System.err.println(cnfExc.getClass().getName() + ": " + cnfExc.getMessage());
            System.exit(1);
        } catch(SQLException sqlExc) {
            System.err.println("Cannot connect to database.");
            System.err.println(sqlExc.getClass().getName() + ": " + sqlExc.getMessage());
        }
        return ct;
    }
}
