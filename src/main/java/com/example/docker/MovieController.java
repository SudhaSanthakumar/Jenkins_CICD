package com.example.docker;

import java.util.List;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1")
public class MovieController {
	
	@Autowired
	MovieRepository mRepo;
	
	
	
	@GetMapping("/movies")
	public List<Movie> getMovies() {

		System.out.println("inside get movies");
		List<Movie> mov=mRepo.findAll();
		System.out.println(mov.toString());
		return mov ;

	}
	
	@PostMapping("/movies")
	public Movie saveMovies(@RequestBody Movie movie) {
		return mRepo.save(movie);
	}

}
