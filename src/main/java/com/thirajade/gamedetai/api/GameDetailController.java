package com.thirajade.gamedetai.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GameDetailController {

	GameRequest gameRequest = new GameRequest("valorant");

	@RequestMapping("/gameDetail")
	public GameRequest getAllGameRequest(){
		return gameRequest;
	}

	@GetMapping(value = "/gameDetail")
	public ResponseEntity index() {
		return ResponseEntity.ok(gameRequest);
	}
}
