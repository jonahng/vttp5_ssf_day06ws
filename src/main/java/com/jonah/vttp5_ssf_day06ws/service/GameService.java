package com.jonah.vttp5_ssf_day06ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonah.vttp5_ssf_day06ws.repository.ListRepo;

@Service
public class GameService {
    @Autowired
    ListRepo listRepo;

    
}
