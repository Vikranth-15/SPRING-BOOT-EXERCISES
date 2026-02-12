package com.example.cricketTeam.CricketTeam;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PlayerService implements PlayerRepository{
    HashMap<Integer,Player> hm=new HashMap<>();
    int id=3;

    PlayerService() {
        Player p1 = new Player(1, "Vikky", 11, "BatsMan");
        Player p2 = new Player(2, "Ram", 22, "All Rounder");
        hm.put(p1.getPlayerId(), p1);
        hm.put(p2.getPlayerId(), p2);
    }

    @Override
    public ArrayList<Player> getPlayers() {
        Collection<Player> player=hm.values();
        ArrayList<Player> players=new ArrayList<>(player);
        return players;
    }

    @Override
    public Player getPlayerById(int playerId) {
        Player p=hm.get(playerId);
        if(p==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return p;
    }

    @Override
    public Player addPlayer(Player player) {
      player.setPlayerId(id);
      hm.put(id,player);
      id=id+1 ;
      return  player;
    }

    @Override
    public Player updatePlayer(int playerId, Player player) {
        Player existingPlayer=hm.get(playerId);
        if(existingPlayer==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(player.getPlayerName()!=null){
            existingPlayer.setPlayerName(player.getPlayerName());
        }
        if(player.getRole()!=null){
            existingPlayer.setRole(player.getRole());
        }
        if(player.getJerseyNumber()!=0){
            existingPlayer.setJerseyNumber(player.getJerseyNumber());
        }
        return existingPlayer;
    }

    @Override
    public void deletePlayer(int playerId) {
        Player p=hm.get(playerId);
        if(p==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        hm.remove(playerId);
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }


}
