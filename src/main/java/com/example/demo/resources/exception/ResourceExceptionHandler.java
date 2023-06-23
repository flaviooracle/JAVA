package com.example.demo.resources.exception;

import com.example.demo.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


@ControllerAdvice
public class ResourceExceptionHandler
{
    // quando uma exceção do tipo object not found exception acontecer ele
    // irá executar este metodo
    // trazendo a exceção e quem gerou..
    // retornando a classe StandardErro
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request)
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new StandardError(LocalDateTime.now(),
                                                                ex.getMessage(),
                                                                HttpStatus.NOT_FOUND.value(),
                                                                request.getRequestURI()));
    }
}