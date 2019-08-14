package com.stackroute.springbootneo4j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// Allows to write global code that can be applied to a wide range of controllers
@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
    //    For handling the errors for movie stars which are not found
//    Exception handler is used for handling exceptions in specific handler classes and/or handler methods.
    @ExceptionHandler({MovieStarNotFoundException.class})
    public ResponseEntity<String> handleTrackNotFoundExceptions(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    //    For handling the errors for movie stars already exists
    @ExceptionHandler({MovieStarAlreadyExistException.class})
    public ResponseEntity<String> handleTrackAlreadyExistExceptions(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }

    //Handles Internal_Server_Error i.e if database connection fails
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> databaseConnectionFailExceptions(Exception ex) {
        return new ResponseEntity<>("Database connectivity is lost", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
