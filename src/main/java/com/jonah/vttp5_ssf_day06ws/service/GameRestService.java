package com.jonah.vttp5_ssf_day06ws.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.jonah.vttp5_ssf_day06ws.model.Game;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

@Service
public class GameRestService {
    RestTemplate restTemplate = new RestTemplate();

    public List<Game> getGames(){
        //String carparkData = restTemplate.getForObject(Url.carparkUrl, String.class); THIS IS TO TAKE THE JSON FILE FROM A URL
        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src\\main\\resources\\game.json");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JsonReader jReader = Json.createReader(fileInputStream);
        JsonArray gameArray = jReader.readArray();
        
        List<Game> listOfGames = new ArrayList<>();

        for(int i = 0; i< gameArray.size(); i++){

            Game g = new Game();
            JsonObject gameJsonObject = gameArray.getJsonObject(i);
            System.out.println("game Json Object = : " + gameJsonObject);

            listOfGames.add(g);
        }
        return listOfGames;
    }


    
}
