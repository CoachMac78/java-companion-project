package com.organization.bootcamp.mvcporoject.api.service;

import java.util.List;

import com.organization.bootcamp.mvcporoject.api.model.Game;

public interface GameService {

	List<Game> retrieveAllGames();

	Game saveGame(Game game);
	
	Game findGameById(Long id);
	
	boolean deleteGame(Long id);

}
