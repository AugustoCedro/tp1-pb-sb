package com.example.demo.dto;

import com.example.demo.model.Classe;
import com.example.demo.model.Companheiro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AventureiroDTO(
        @NotBlank
        String nome,
        @NotNull
        Classe classe,
        @Positive@NotNull
        Integer nivel
) {
}
