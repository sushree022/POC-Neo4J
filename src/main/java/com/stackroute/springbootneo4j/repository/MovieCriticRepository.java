package com.stackroute.springbootneo4j.repository;

import com.stackroute.springbootneo4j.domain.MovieCritic;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MovieCriticRepository extends Neo4jRepository<MovieCritic,Long> {
    @Query("MATCH (c:Critic)<-[r:RATED]-(m:Movie) RETURN c,r,m")
    Collection<MovieCritic> getAllCritic();
    @Query("CREATE(m:Movies)-[:RATED {rating: {rating}]->(c:Critic)")
    MovieCritic setRelation(@Param("rating") int rating);
}
