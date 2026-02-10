package com.example.demo.dto;

import com.example.demo.model.Classe;
import com.example.demo.model.Companheiro;
import jakarta.validation.constraints.*;

public record AventureiroDTO(
        @NotBlank(message = "Nome deve ser preenchido")
        @Size(min = 3, message = "Nome precisa ter 3 ou mais caracteres")
        String nome,
        @NotNull(message = "Classe deve ser preenchida")
        String classe,
        @Positive(message = "nível deve ser maior ou igual a 1")
        @NotNull(message = "nível deve ser preenchido")
        Integer nivel
) {
}
