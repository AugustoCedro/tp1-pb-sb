package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.exceptions.AventureiroNotFoundException;
import com.example.demo.exceptions.InvalidClassException;
import com.example.demo.exceptions.InvalidEspecieException;
import com.example.demo.model.Aventureiro;
import com.example.demo.model.Classe;
import com.example.demo.model.Companheiro;
import com.example.demo.model.Especie;
import com.example.demo.repository.AventureiroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AventureiroService {

    private final AventureiroRepository repository;

    public Aventureiro registrar(AventureiroDTO dto){
        Aventureiro aventureiro = new Aventureiro(dto.nome(), isClasseValid(dto.classe()), dto.nivel());
        repository.adicionar(aventureiro);
        return aventureiro;
    }

    public Aventureiro consultarPorId(Long id) {
        return repository.consultarPorId(id);
    }

    public Aventureiro atualizar(Long id, AventureiroUpdateDTO dto) {
       return repository.atualizar(id,dto);
    }

    public Aventureiro encerrarVinculo(Long id) {
        Aventureiro aventureiro = consultarPorId(id);
        aventureiro.setAtivo(false);
        return aventureiro;
    };

    public Aventureiro recrutar(Long id) {
        Aventureiro aventureiro = consultarPorId(id);
        aventureiro.setAtivo(true);
        return aventureiro;
    };

    public Aventureiro definirCompanheiro(Long id, CompanheiroDTO dto) {
        Aventureiro aventureiro = consultarPorId(id);
        Especie especie = Arrays.stream(Especie.values())
                .filter(e -> e.name().equalsIgnoreCase(String.valueOf(dto.especie())))
                .findFirst().orElseThrow(() -> new InvalidEspecieException("Espécie inválida"));

        aventureiro.setCompanheiro(new Companheiro(dto.nome(),especie,dto.lealdade()));
        return aventureiro;
    }

    public Aventureiro removerCompanheiro(Long id) {
        Aventureiro aventureiro = consultarPorId(id);
        aventureiro.setCompanheiro(null);
        return aventureiro;
    }
    public PagedResponseDTO<AventureiroResponseDTO> consultarPaginado(int page, int size, String classe, Boolean ativo, Integer nivel) {
        List<Aventureiro> aventureiroList = repository.consultarPaginado(classe,ativo,nivel);
        List<AventureiroResponseDTO> aventureiroResponseList = aventureiroList
                .stream()
                .map(a -> new AventureiroResponseDTO(a.getId(),a.getNome(),a.getNivel(),a.getClasse(),a.getAtivo()))
                .toList();
        int total = aventureiroList.size();
        int fromIndex = page * size;
        int toIndex = Math.min(fromIndex + size,total);

        List<AventureiroResponseDTO> conteudo = fromIndex >= total ? List.of() : aventureiroResponseList.subList(fromIndex,toIndex);
        return new PagedResponseDTO<>(page,size,total,conteudo);
    }

    private Classe isClasseValid(String classe){
        return Arrays.stream(Classe.values())
                .filter(c -> c.name().equalsIgnoreCase(String.valueOf(classe)))
                .findFirst().orElseThrow(() -> new InvalidClassException("Classe inválida"));
    }
}
