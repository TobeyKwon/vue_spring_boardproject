package com.example.blog.api.exadvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        HashMap<Object, Object> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors()
                .forEach(e -> {
                        if( e instanceof FieldError) {
                            errors.put(((FieldError) e).getField(), e.getDefaultMessage());
                        } else {
                            errors.put(e.getObjectName(), e.getDefaultMessage());
                        }
                    }
                );
        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
    }
}
