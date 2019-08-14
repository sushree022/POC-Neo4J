package com.stackroute.springbootneo4j.repository;

import com.stackroute.springbootneo4j.domain.MovieStars;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieStarRepository extends Neo4jRepository<MovieStars,Integer> {
}
