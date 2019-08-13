package com.stackroute.springbootneo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

//Node entity is used to declare that this POJO class is an entity backed by a node in the graph database.
@NodeEntity

/*  Data bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter
    and @RequiredArgsConstructor together*/
@Data

// It generates constructor with no parameters
@NoArgsConstructor

// It generates a constructor with 1 parameter for each field
@AllArgsConstructor

/*  It produces complex builder APIs for class
    It automatically produce the code required to have your class be instantiable with code
 */
public class MovieStars {
    //    declaration of variables
    @GraphId
    private int movieStarid;
    private String movieStarName;
    private int movieStarAge;
    private String movieStarGender;
    @Relationship(type="is in")
    private List<Movies> listOfMovies;
}
