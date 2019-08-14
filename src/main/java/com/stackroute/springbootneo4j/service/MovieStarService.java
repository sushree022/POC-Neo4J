package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.MovieStars;
import com.stackroute.springbootneo4j.exception.MovieStarAlreadyExistException;
import com.stackroute.springbootneo4j.exception.MovieStarNotFoundException;

import java.util.List;

public interface MovieStarService {
    //    methods to operate:
    //    to save a track and trow exception message if same track already present
    public MovieStars saveTrack(MovieStars movieStars) throws MovieStarAlreadyExistException;

    //    to get all the tracks
    public List<MovieStars> getAllTracks();

    //    to get track by id and to throw exception if track not found
    public MovieStars getTrackById(int id) throws MovieStarNotFoundException;

    //    to delete by id and to throw exception if track not found
    public MovieStars deleteById(int id) throws MovieStarNotFoundException;

    //    to update a track and also throw exception
    public MovieStars updateTrack(MovieStars movieStars) throws MovieStarNotFoundException;
}
