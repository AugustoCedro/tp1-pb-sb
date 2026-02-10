package com.example.demo.advice;

import com.example.demo.dto.ErrorFieldDTO;
import com.example.demo.dto.ErrorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class HandleExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDTO> handleMethodArgumentNotValid(MethodArgumentNotValidException ex){
        List<ErrorFieldDTO> errorList = ex.getFieldErrors().stream().map(fieldError -> new ErrorFieldDTO(fieldError.getField(),fieldError.getDefaultMessage())).toList();
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Socilitação Inválida",errorList);
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
