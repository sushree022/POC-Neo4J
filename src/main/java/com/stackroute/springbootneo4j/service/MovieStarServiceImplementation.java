package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.MovieStars;
import com.stackroute.springbootneo4j.exception.MovieStarAlreadyExistException;
import com.stackroute.springbootneo4j.exception.MovieStarNotFoundException;
import com.stackroute.springbootneo4j.repository.MovieStarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieStarServiceImplementation implements MovieStarService{
    private MovieStarRepository movieStarRepository;
    @Autowired
    public MovieStarServiceImplementation(MovieStarRepository movieStarRepository) {
        this.movieStarRepository = movieStarRepository;
    }

    @Override
    public MovieStars saveTrack(MovieStars movieStars) throws MovieStarAlreadyExistException {
        return null;
    }

    @Override
    public List<MovieStars> getAllTracks() {
        return null;
    }

    @Override
    public MovieStars getTrackById(int id) throws MovieStarNotFoundException {
        return null;
    }

    @Override
    public MovieStars deleteById(int id) throws MovieStarNotFoundException {
        return null;
    }

    @Override
    public MovieStars updateTrack(MovieStars movieStars) throws MovieStarNotFoundException {
        return null;
    }
}
