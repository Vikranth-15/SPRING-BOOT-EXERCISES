package com.example.cricketTeam.CricketTeam;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PlayerController {

    PlayerService ps=new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return ps.getPlayers();
    }

    @GetMapping("/players/{playerId}")

    public Player getPlayerById(@PathVariable("playerId") int playerId){
       return ps.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
      return  ps.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(
            @PathVariable("playerId") int playerId,
            @RequestBody Player player) {
        return ps.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")

    public void deletePlayer(@PathVariable("playerId") int playerId){
        ps.deletePlayer(playerId);
    }
}
