package com.example.demo.dto;

import com.example.demo.model.Classe;

public record AventureiroResponseDTO(
        Long id,
        String nome,
        Integer nivel,
        Classe classe,
        Boolean ativo
) {
}
