
package com.organization.mvcproject.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

public class CompanyImpl {

	private Long id;
	private String name;
	private List<GameImpl> gamesMade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GameImpl> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<GameImpl> gamesMade) {
		this.gamesMade = gamesMade;
	}
}