package com.cts.ratingservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.ratingservice.model.MovieSummary;
import com.cts.ratingservice.model.Rating;
import com.cts.ratingservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/movies/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") int movieId) {
		MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
				MovieSummary.class);
		
	 return new Rating(movieId, movieSummary.getVote_average());
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
//		
//		userRating.initData(userId);
		
		List<Integer> moviesId = new ArrayList<Integer>();
		moviesId.add(100);
		moviesId.add(150);
		moviesId.add(200);
		moviesId.add(550);
		List<Rating> ratings = new ArrayList<Rating>();
		for (Integer movieId : moviesId) {
			Rating rating = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
					Rating.class);
			System.out.println(rating);
			ratings.add(rating);
		}
		
		UserRating userRating = new UserRating();	
		userRating.setUserId(userId);
		userRating.setRatings(ratings);
		return userRating;

	}

}
