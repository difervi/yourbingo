package org.yourbingo.bingofullstack.service;

import org.springframework.stereotype.Service;
import org.yourbingo.bingofullstack.entities.Game;
import org.yourbingo.bingofullstack.repository.GameRepository;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
    public Game save(Game game){
        return gameRepository.save(game);
    }

}
