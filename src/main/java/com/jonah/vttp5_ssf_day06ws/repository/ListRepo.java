package com.jonah.vttp5_ssf_day06ws.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.jonah.vttp5_ssf_day06ws.constant.Constant;
import com.jonah.vttp5_ssf_day06ws.model.Game;

@Repository
public class ListRepo {
    @Autowired
    @Qualifier(Constant.template01)
    RedisTemplate<String, String> template;

    public void leftPush(String key, String value) {
        template.opsForList().leftPush(key, value);
    }
    
    public void rightPush(String key, String value) {
        template.opsForList().rightPush(key, value);
    }

    // slide 30
    public void leftPop(String key) {
        template.opsForList().leftPop(key, 1);
    }

    // slide 32
    public String get(String key, Integer index) {
        return template.opsForList().index(key, index).toString();
    }

    // slide 33
    public Long size(String key) {
        return template.opsForList().size(key);
    }

    public List<String> getList(String key) {
        List<String> list = template.opsForList().range(key, 0, -1);

        return list;
    }

    public void hashRightPush(String redisKey, String mapKey, String mapValue){
        template.opsForHash().put(redisKey, mapKey, mapValue);
    }

    public String getHashValue(String redisKey, String mapKey){
        return template.opsForHash().get(redisKey, mapKey).toString();
    }

    public Game getGameFromId(String redisKey, String mapKey){
        Game g = new Game();
        String GameDataString = template.opsForHash().get(redisKey, mapKey).toString();
        System.out.println("IN LISTREPO game retrieved!" + GameDataString);
        String[] GameDataStringArray = GameDataString.split(",");
        g.setGid(Integer.valueOf(GameDataStringArray[0]));
        g.setName(GameDataStringArray[1]);
        g.setYear(Integer.valueOf(GameDataStringArray[2]));
        g.setRanking(Integer.valueOf(GameDataStringArray[3]));
        g.setUsers_rated(Integer.valueOf(GameDataStringArray[4]));
        g.setUrl(GameDataStringArray[5]);
        g.setImage(GameDataStringArray[6]);
        System.out.println("LISTREPO, the game found retrieved and made into a new game object is" + g);
        return g;

    }


}
