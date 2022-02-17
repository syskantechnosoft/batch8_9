package com.cts.movieservice.model;

public class Movie {

	private int movieId;
	private String name;
	private String description;

	public Movie(int movieId, String name, String description) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.description = description;
	}

	public Movie() {
		super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
