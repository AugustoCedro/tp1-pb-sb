package com.example.demo.dto;

import java.util.List;

public record ErrorResponseDTO(
        String mensagem,
        List<String> detalhes
) {
}
