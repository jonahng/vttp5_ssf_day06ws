package com.jonah.vttp5_ssf_day06ws.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonah.vttp5_ssf_day06ws.model.Game;
import com.jonah.vttp5_ssf_day06ws.service.GameRestService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/api/boardgame", produces = "application/json")
public class GameRestController {
    @Autowired
    GameRestService gameRestService;
    
    @GetMapping
    public ResponseEntity<List<Game>> getGames(){
        List<Game> allGames = new ArrayList<>();
        allGames = gameRestService.getGames();

        return ResponseEntity.ok().body(allGames);
    }


    @GetMapping(path="/{gameId}", produces="application/json")
    public ResponseEntity<Game> getGameId(@PathVariable(name="gameId") String gameId){

            Game game = gameRestService.getGameFromId(gameId);
            System.out.println("game found " + game);



        return ResponseEntity.ok().body(game);
    }
    
    
}
