// This class handles various methods for the players' data

package org.group12.model;

public class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player() {
        this.name = "";
        this.score = 0;
    }

    public Player(String playerName) {
        this.name = playerName;
        this.score = 0;
    }

    public Player(String playerName, int score) {
        this.name = playerName;
        this.score = score;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void incrementScore() { this.score += 1; }
    public int getScore() { return score; }

    @Override public int compareTo(Player p) {
        int pScore = p.getScore();
        return pScore - this.score;
    }

}
