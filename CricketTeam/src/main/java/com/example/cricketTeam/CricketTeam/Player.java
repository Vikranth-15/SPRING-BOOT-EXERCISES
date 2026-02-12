package com.example.cricketTeam.CricketTeam;

public class Player {

    private int playerId;
    private String playerName;
    private int jerseyNumber;

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }
    Player(int playerId,String playerName,int jerseyNumber,String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    private String role;
}
