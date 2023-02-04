package com.organization.mvcproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.bootcamp.mvcporoject.api.dao.GameDAO;
import com.organization.bootcamp.mvcporoject.api.model.Game;
import com.organization.bootcamp.mvcporoject.api.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDAO gameLoopBasedDao;
	
	public List<Game> retrieveAllGames() {
		return gameLoopBasedDao.findAllGames();
	}
	
	public Game saveGame(Game game) {
		return gameLoopBasedDao.saveGame(game);
	}
	
	public Game findGameById(Long id) {
		return gameLoopBasedDao.findGameById(id);
	}
	
	public boolean deleteGame(Long id) {
		return deleteGame(id);
	}
}