package com.example.demo.dto;

import com.example.demo.model.Especie;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record CompanheiroDTO(
        @NotBlank(message = "Nome deve ser preenchido")
        @Size(min = 3, message = "Nome precisa ter 3 ou mais caracteres")
        String nome,
        @NotBlank(message = "Espécie deve ser preenchida")
        String especie,
        @PositiveOrZero(message = "Lealdade deve maior ou igual a 0")
        @NotNull(message = "Lealdade deve ser preenchida")
        Integer lealdade
) {
}
