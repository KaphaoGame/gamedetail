package com.thirajade.gamedetai.api;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GameRequest {
	private GameDetailModel gameDetailModel;
	private String request_url = "https://rawg-video-games-database.p.rapidapi.com/games/";
	
	public GameRequest(String nameGame){
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
			.url(request_url + nameGame)
			.get()
			.addHeader("x-rapidapi-host", "rawg-video-games-database.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "87576c0ae3msh1ff66b15fd66cbap103c00jsn4d045c77c08a")
			.build();
		
		Response response;
		try {
			response = client.newCall(request).execute();
			String string = response.body().string();
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(string);
			Long id = (Long) jsonObject.get("id");
			String slug = (String) jsonObject.get("slug");
			String gameName = (String) jsonObject.get("name");
			String gameDescription = (String) jsonObject.get("description");
			String gameDescription_raw = (String) jsonObject.get("description_raw");
			String gameReleaseDate = (String) jsonObject.get("released");
			String gameImageURL = (String) jsonObject.get("background_image");
			Long metacriticScore = (Long) jsonObject.get("metacritic");
			gameDetailModel = new GameDetailModel(id,
					slug,
					gameName,
					gameDescription,
					gameDescription_raw,
					gameReleaseDate,
					gameImageURL,
					metacriticScore);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public GameDetailModel getGameDetailModel() {
		return gameDetailModel;
	}
	
}
