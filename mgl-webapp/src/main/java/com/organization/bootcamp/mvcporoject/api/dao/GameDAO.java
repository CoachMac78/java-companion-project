package com.organization.bootcamp.mvcporoject.api.dao;

import java.util.List;

import com.organization.bootcamp.mvcporoject.api.model.Game;

public interface GameDAO {
	
	Game findGameById(Long id);
	
	boolean deleteGame(Long id);
	
	Game saveGame(Game game);
	
	List<Game> findAllGames();	

}
