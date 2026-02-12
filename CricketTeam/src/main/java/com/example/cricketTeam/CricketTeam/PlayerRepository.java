package com.example.cricketTeam.CricketTeam;

import java.util.ArrayList;

public interface PlayerRepository {

    public ArrayList<Player> getPlayers();

    Player getPlayerById(int playerId);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId,Player player);

    void deletePlayer(int playerId);

}
