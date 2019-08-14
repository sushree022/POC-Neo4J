package com.stackroute.springbootneo4j.exception;

public class MovieStarAlreadyExistException extends Exception {
    public MovieStarAlreadyExistException(String message) {
        super(message);
    }
}
