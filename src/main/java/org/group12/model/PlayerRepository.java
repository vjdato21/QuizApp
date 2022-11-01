// This class creates an ArrayList so that it can hold player's data (though this is only a volatile database of some sort)
// Creates a SQLite table database for hold player's data permanently.

package org.group12.model;

import org.group12.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class PlayerRepository {
    private ArrayList<Player> players = new ArrayList<>();

    public PlayerRepository() {
        Connection ct = Database.getDBConnection();
        // initialise database query
       String sql = "CREATE TABLE IF NOT EXISTS `Players` (" +
                "id      INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
        "name    VARCHAR(100) NOT NULL," +
        "score   INTEGER DEFAULT 0" +
        ");";

        try {
            Statement stmt = ct.createStatement();
            ct.setAutoCommit(false);

            stmt.execute(sql);
            ct.commit();

            ct.close();
        } catch (SQLException sqlExc) {
            try {
                ct.rollback();
                ct.close();
            } catch (SQLException sqlExcRb) {
                System.err.println("Something went wrong when rolling back SQL Command...");
                System.err.println("[" + sqlExcRb.getErrorCode() + "]: " + sqlExcRb.getMessage());
            }

            switch (sqlExc.getErrorCode()) {
                case 1065 -> System.out.println("Query Successfully Executed!");
                case 1050 -> System.out.println("WARNING: Table already exists.. Skipping Table Generation...");
                default -> {
                    System.err.println("Something went wrong when executing SQL Command...");
                    System.err.println("[" + sqlExc.getErrorCode() + "]: " + sqlExc.getMessage());
                }
            }

        }
    }

    public ArrayList<Player> getAllPlayers() {
        Connection ct = Database.getDBConnection();
        String sql = "SELECT * FROM `Players`;";
        ResultSet dbPlayers;
        players = new ArrayList<>();

        try {
            if(ct == null) System.err.println("Cannot connect to Database Server. Please try again later.");
            PreparedStatement stmt = ct.prepareStatement(sql);
            dbPlayers = stmt.executeQuery();
            ct.setAutoCommit(false);

            if(dbPlayers.next()) {
                do {
                    Player currPlayer = new Player(
                            dbPlayers.getString("name"),
                            dbPlayers.getInt("score")
                    );
                    players.add(currPlayer);
                } while(dbPlayers.next());

                ct.commit();
            } else {
                System.out.println("There are currently no Players on the Leaderboard.");
            }

            ct.close();
        } catch(SQLException sqlExc) {
            System.err.println("Something went wrong when executing SQL Command...");
            System.err.println("[" + sqlExc.getErrorCode() + "]: " + sqlExc.getMessage());
        }

        return players;
    }

    public void addPlayer(Player player) {
        Connection ct = Database.getDBConnection();
        String sql = "INSERT INTO `Players`(`name`, `score`) VALUES (?,?);";

        try {
            if(ct == null) System.err.println("Cannot connect to SQL Server. Please try again later.");
            ct.setAutoCommit(false);

            PreparedStatement stmt = ct.prepareStatement(sql);

            stmt.setString(1, player.getName());
            stmt.setInt(2, player.getScore());

            stmt.executeUpdate();

            ct.commit();
            ct.close();

        } catch(SQLException sqlExc) {
            System.err.println("Something went wrong when executing SQL Command...");
            System.err.println("[" + sqlExc.getErrorCode() + "]: " + sqlExc.getMessage());
        }
    }

}

