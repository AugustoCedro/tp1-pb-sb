package com.example.demo.exceptions;

public class InvalidEspecieException extends RuntimeException {
    public InvalidEspecieException(String message) {
        super(message);
    }
}
