package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Companheiro {
    @NotBlank
    private String nome;
    @NotNull
    private Especie especie;
    @PositiveOrZero @NotNull
    private Integer lealdade;
}
