package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Aventureiro {
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private Classe classe;
    @Positive @NotNull
    private Integer nivel;
    private Boolean ativo;
    private Companheiro companheiro;

    private static Long lastId = 0L;

    public Aventureiro(String nome, Classe classe, Integer nivel) {
        this.id = ++lastId;
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.ativo = true;
    }


}
