package com.thirajade.gamedetai.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class GameDetailController {

	private List<GameRequest> myGameRequest = new ArrayList();

	public GameDetailController() {
		myGameRequest.add(new GameRequest("valorant"));
	}

	@GetMapping(value = "/")
	public ResponseEntity index() {
		return ResponseEntity.ok(myGameRequest);
	}
}
