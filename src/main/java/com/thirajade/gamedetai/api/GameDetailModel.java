package com.thirajade.gamedetai.api;

import java.util.List;

public class GameDetailModel {
	private Long id;
	private String slug;
	private String gameName; 
	private String gameDescription;
	private String gameDescription_raw;
	private String gameReleaseDate;
	private String gameImageURL;
	private Long metacriticScore;
	private List<Object> platforms;
	private List<Object> genres;
	private Object gameVideoURL;
	private List<Object> gameDevelopers;
	private List<Object> gamePublishers;
	private List<Object> gameTags;

	public GameDetailModel(Long id, String slug, String gameName, String gameDescription, String gameDescription_raw,
						   String gameReleaseDate, String gameImageURL, Long metacriticScore, List<Object> platforms,
						   List<Object> genres, Object gameVideoURL, List<Object> gameDevelopers,
						   List<Object> gamePublishers, List<Object> gameTags) {
		this.id = id;
		this.slug = slug;
		this.gameName = gameName;
		this.gameDescription = gameDescription;
		this.gameDescription_raw = gameDescription_raw;
		this.gameReleaseDate = gameReleaseDate;
		this.gameImageURL = gameImageURL;
		this.metacriticScore = metacriticScore;
		this.platforms = platforms;
		this.genres = genres;
		this.gameVideoURL = gameVideoURL;
		this.gameDevelopers = gameDevelopers;
		this.gamePublishers = gamePublishers;
		this.gameTags = gameTags;
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

	public List<Object> getPlatforms() {
		return platforms;
	}

	public List<Object> getGenres() {
		return genres;
	}

	public Object getGameVideoURL() {
		return gameVideoURL;
	}

	public List<Object> getGameDevelopers() {
		return gameDevelopers;
	}

	public List<Object> getGamePublishers() {
		return gamePublishers;
	}

	public List<Object> getGameTags() {
		return gameTags;
	}
}
