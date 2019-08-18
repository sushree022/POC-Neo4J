package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.MovieCritic;
import com.stackroute.springbootneo4j.domain.Movies;
import com.stackroute.springbootneo4j.repository.MovieCriticRepository;
import com.stackroute.springbootneo4j.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RatingServiceImplementation implements RatingService {
    private MovieCriticRepository movieCriticRepository;
    private MovieRepository movieRepository;
    @Autowired
    public RatingServiceImplementation(MovieCriticRepository movieCriticRepository, MovieRepository movieRepository) {
        this.movieCriticRepository = movieCriticRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieCritic saveMovieCritic(MovieCritic movieCritic) {
        return movieCriticRepository.save(movieCritic);
    }

    @Override
    public Collection<MovieCritic> getAllMovieCritics() {
        return movieCriticRepository.getAllCritic();
    }

    @Override
    public MovieCritic getMovieCriticById(MovieCritic movieCritic) {
        return movieCriticRepository.findById(movieCritic.getCriticId()).get();
    }

    @Override
    public MovieCritic deleteCriticById(MovieCritic movieCritic) {
        Optional<MovieCritic> optionalMovie = movieCriticRepository.findById(movieCritic.getCriticId());
        movieCriticRepository.deleteById(movieCritic.getCriticId());
        return optionalMovie.get();
    }

    @Override
    public MovieCritic updateMovieCritic(MovieCritic movieCritic) {
        movieCriticRepository.deleteById(movieCritic.getCriticId());
        return movieCriticRepository.save(movieCritic);

    }

    @Override
    public Movies getMovieById(Movies movie) {
        return movieRepository.findById(movie.getMovieId()).get();
    }

    @Override
    public Movies saveMovie(Movies movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movies deleteMovieById(Movies movie) {
        Optional<Movies> optionalMovie = movieRepository.findById(movie.getMovieId());
        movieRepository.deleteById(movie.getMovieId());
        return optionalMovie.get();
    }

    @Override
    public Movies updateMovieById(Movies movie) {
        movieRepository.deleteById(movie.getMovieId());
        return movieRepository.save(movie);
    }

    @Override
    public MovieCritic setRelation(long criticId, long movieId, int rating) {
        return movieCriticRepository.setRelation(rating);
    }
}
