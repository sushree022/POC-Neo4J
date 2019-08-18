package com.stackroute.springbootneo4j.repository;

import com.stackroute.springbootneo4j.domain.Movies;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movies,Long> {
}
