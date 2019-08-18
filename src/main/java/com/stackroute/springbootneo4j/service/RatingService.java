package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.MovieCritic;
import com.stackroute.springbootneo4j.domain.Movies;

import java.util.Collection;


public interface RatingService {
    //    methods to operate:
    //    to save details of movie critics and trow exception message if same details of movie critic already present
     MovieCritic saveMovieCritic(MovieCritic movieCritic);

    //    to get all the movie stars
     Collection<MovieCritic> getAllMovieCritics();

    //    to get movie star by id and to throw exception if movie star not found
     MovieCritic getMovieCriticById(MovieCritic movieCritic);

    //    to delete by id and to throw exception if movie star not found
     MovieCritic deleteCriticById(MovieCritic movieCritic);

    //    to update details of movie star and also throw exception
     MovieCritic updateMovieCritic(MovieCritic movieCritic);

    Movies getMovieById(Movies movies);

    Movies saveMovie(Movies movies);

    Iterable<Movies> getAllMovies();

    Movies deleteMovieById(Movies movies);

    Movies updateMovieById(Movies movies);
    MovieCritic setRelation(long criticId, long movieId, int rating);
}
