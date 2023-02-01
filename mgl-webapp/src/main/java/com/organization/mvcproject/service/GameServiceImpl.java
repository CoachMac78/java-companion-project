package com.organization.mvcproject.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.organization.mvcproject.model.Game;
import com.organization.mvcproject.dao.GameLoopBasedDAO;
import com.organization.mvcproject.service.*;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameLoopBasedDAO gameDao;
	
	public List<Game> retrieveAllGames() {
		return gameDao.findAllGames();
	}
	
	public Game saveGame(Game game) {
		return gameDao.saveGame(game);
	}
	
	public Game findGameById(Long id) {
		return gameDao.findGameById(id);
	}
	
	public boolean deleteGame(Long id) {
		return deleteGame(id);
	}
}