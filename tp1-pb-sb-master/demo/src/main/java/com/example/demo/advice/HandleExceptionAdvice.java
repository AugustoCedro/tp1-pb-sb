package com.example.demo.advice;

import com.example.demo.dto.ErrorResponseDTO;
import com.example.demo.exceptions.AventureiroNotFoundException;
import com.example.demo.exceptions.InvalidClassException;
import com.example.demo.exceptions.InvalidEspecieException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class HandleExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDTO> handleMethodArgumentNotValid(MethodArgumentNotValidException ex){
        List<String> errorList = ex.getFieldErrors().stream().map(fieldError -> fieldError.getDefaultMessage()).toList();
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Socilitação Inválida",errorList);
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(InvalidClassException.class)
    public ResponseEntity<ErrorResponseDTO> handleInvalidClass(InvalidClassException ex){
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Solicitação Inválida", List.of(ex.getMessage()));
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(InvalidEspecieException.class)
    public ResponseEntity<ErrorResponseDTO> handleInvalidEspecie(InvalidEspecieException ex){
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Solicitação Inválida", List.of(ex.getMessage()));
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(AventureiroNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleAventureiroNotFound(AventureiroNotFoundException ex){
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Socilitação Inválida",List.of(ex.getMessage()));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponseDTO> handleConstraintViolation(ConstraintViolationException ex){
        List<String> errorList = ex.getConstraintViolations().stream().map(v -> v.getMessage()).toList();
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Solicitação Inválida",errorList);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }



}
