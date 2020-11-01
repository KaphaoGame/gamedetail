package com.thirajade.gamedetai.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class GameDetailController {

	private List<GameRequest> myGameRequest;

	public GameDetailController() {

	}


	@GetMapping(value = "/")
	public ResponseEntity checkToGameRequestList(@RequestParam(value="name") String name) {
		myGameRequest = new ArrayList<>();
		myGameRequest.add(new GameRequest(name));
		return ResponseEntity.ok(myGameRequest);
	}

	@PostMapping(value = "/")
	public ResponseEntity addToGameRequestList(@RequestParam(value="name") String name) {
		myGameRequest = new ArrayList<>();
		myGameRequest.add(new GameRequest(name));
		return ResponseEntity.ok(myGameRequest);
	}
}
