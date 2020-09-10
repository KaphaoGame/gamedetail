package com.thirajade.gamedetai.api;

public class GameDetailModel {
	private Long id;
	private String slug;
	private String gameName; 
	private String gameDescription;
	private String gameDescription_raw;
	private String gameReleaseDate;
	private String gameImageURL;
	private Long metacriticScore;
	
	public GameDetailModel(Long id, String slug, String gameName, String gameDescription, String gameDescription_raw, String gameReleaseDate, String gameImageURL, Long metacriticScore){
			this.id = id;
			this.slug = slug;
			this.gameName = gameName;
	        this.gameDescription = gameDescription;
	        this.gameDescription_raw = gameDescription_raw;
	        this.gameReleaseDate = gameReleaseDate;
	        this.gameImageURL = gameImageURL;
	        this.metacriticScore = metacriticScore;
	    }

	public Long getID() {
		return id;
	}
	
	public String getSlug() {
		return slug;
	}
	
	public String getGameName() {
		return gameName;
	}

	public String getGameDescription() {
		return gameDescription;
	}

	public String getGameDescription_raw() {
		return gameDescription_raw;
	}

	public String getGameReleaseDate() {
		return gameReleaseDate;
	}

	public String getGameImageURL() {
		return gameImageURL;
	}

	public Long getMetacriticScore() {
		return metacriticScore;
	}
}
