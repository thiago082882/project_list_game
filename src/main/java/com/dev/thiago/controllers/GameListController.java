package com.dev.thiago.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dev.thiago.dto.GameListDTO;
import com.dev.thiago.services.GameListService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
//	@Autowired
//	private GameService gameService;
//
//	@GetMapping(value = "/{id}")
//	public GameListDTO findById(@PathVariable Long id) {
//		GameListDTO result = gameListService.findById(id);
//		return result;
//	}
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
//
//	@GetMapping(value = "/{listId}/games")
//	public List<GameMinDTO> findGames(@PathVariable Long listId) {
//		List<GameMinDTO> result = gameService.findByGameList(listId);
//		return result;
//	}
//	
//	@PostMapping(value = "/{listId}/replacement")
//	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
//		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
//	}
}
