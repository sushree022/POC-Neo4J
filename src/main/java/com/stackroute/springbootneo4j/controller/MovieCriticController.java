package com.stackroute.springbootneo4j.controller;

import com.stackroute.springbootneo4j.domain.MovieCritic;
import com.stackroute.springbootneo4j.domain.Movies;
import com.stackroute.springbootneo4j.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1")
public class MovieCriticController {
    private RatingService ratingService;
    @Autowired

    public MovieCriticController(RatingService ratingService) {
        this.ratingService = ratingService;
    }
    @GetMapping(value = "/critics")
    public Collection<MovieCritic> getAllMovieCritics() {
        return ratingService.getAllMovieCritics();
    }

    @GetMapping(value = "/movies")
    public Iterable<Movies> getAllMovie() {
        return ratingService.getAllMovies();
    }

    @PostMapping(value = "/critic")
    public MovieCritic saveMovieCritic(@RequestBody MovieCritic critic) {
        System.out.println("****" + critic);
        return ratingService.saveMovieCritic(critic);
    }

    @PutMapping(value = "/critic")
    public MovieCritic updateMovieCritic(@RequestBody MovieCritic critic) {
        System.out.println("****" + critic);
        return ratingService.updateMovieCritic(critic);
    }

    @PostMapping(value = "/movie")
    public Movies saveMovie(@RequestBody Movies movie) {
        System.out.println("****" + movie);
        return ratingService.saveMovie(movie);
    }

    @PutMapping(value = "/movie")
    public Movies updateMovie(@RequestBody Movies movie) {
        System.out.println("****" + movie);
        return ratingService.updateMovieById(movie);
    }

    @DeleteMapping(value = "/critic")
    public MovieCritic deleteCritic(@RequestBody MovieCritic critic) {
        System.out.println("****" + critic);
        return ratingService.deleteCriticById(critic);
    }

    @DeleteMapping(value = "/movie")
    public Movies deleteMovie(@RequestBody Movies movie) {
        System.out.println("****" + movie);
        return ratingService.deleteMovieById(movie);
    }

    @PostMapping(value = "/critic/set")
    public MovieCritic setRelation(@RequestParam long criticId, long movieId, int rating) {
        return ratingService.setRelation(criticId, movieId, rating);
    }
}
