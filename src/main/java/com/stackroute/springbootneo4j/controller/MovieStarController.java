package com.stackroute.springbootneo4j.controller;

import com.stackroute.springbootneo4j.service.MovieStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MovieStarController {
    private MovieStarService movieStarService;
    @Autowired
    public MovieStarController(MovieStarService movieStarService) {
        this.movieStarService = movieStarService;
    }
}
