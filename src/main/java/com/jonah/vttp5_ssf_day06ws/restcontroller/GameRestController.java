package com.jonah.vttp5_ssf_day06ws.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonah.vttp5_ssf_day06ws.model.Game;
import com.jonah.vttp5_ssf_day06ws.service.GameRestService;

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
    
}
