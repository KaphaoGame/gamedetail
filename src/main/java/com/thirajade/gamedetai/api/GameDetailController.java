package com.thirajade.gamedetai.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GameDetailController {
	
	GameRequest gameRequest = new GameRequest("valorant");
	
	@RequestMapping("/gameDetail")
	public GameRequest getAllGameRequest(){
	    return gameRequest;
	}
	
}
