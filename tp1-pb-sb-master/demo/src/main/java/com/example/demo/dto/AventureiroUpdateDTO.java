package com.example.demo.dto;


import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record AventureiroUpdateDTO(
        @Size(min = 3, message = "Nome precisa ter 3 ou mais caracteres")
        String nome,
        String classe,
        @Positive(message = "nível deve ser maior ou igual a 1")
        Integer nivel
) {
}
