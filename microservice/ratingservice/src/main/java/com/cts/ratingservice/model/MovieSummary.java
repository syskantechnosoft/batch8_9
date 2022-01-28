package com.cts.ratingservice.model;

public class MovieSummary {

	private int id;
	private String title;
	private String overview;
	private double vote_average;

	public MovieSummary() {
		super();
	}

	public MovieSummary(int id, String title, String overview, double vote_average) {
		super();
		this.id = id;
		this.title = title;
		this.overview = overview;
		this.vote_average = vote_average;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public double getVote_average() {
		return vote_average;
	}

	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}

}
