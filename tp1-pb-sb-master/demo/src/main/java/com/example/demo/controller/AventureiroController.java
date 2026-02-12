package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.model.Aventureiro;
import com.example.demo.service.AventureiroService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aventureiros")
@AllArgsConstructor
@Validated
public class AventureiroController {

    private AventureiroService service;

    @PostMapping
    public ResponseEntity<Aventureiro> registrarAventureiro(@RequestBody @Valid AventureiroDTO dto){
        Aventureiro aventureiro = service.registrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(aventureiro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aventureiro> consultarAventureiroPorId(@PathVariable Long id){
        Aventureiro aventureiro = service.consultarPorId(id);
        return ResponseEntity.ok().body(aventureiro);
    }

    @GetMapping
    public ResponseEntity<PagedResponseDTO<AventureiroResponseDTO>> consultarAventureiros(
            @RequestHeader(value = "X-Page",required = false, defaultValue = "0")
            @Min(value = 0, message = "Page não pode ser negativa")
            int page,
            @RequestHeader(value = "X-Size",required = false, defaultValue = "10")
            @Min(value = 1, message = "Size deve ser no mínimo 1")
            @Max(value = 50, message = "Size deve ser no máximo 50")
            int size,
            @RequestParam(required = false) String classe,
            @RequestParam(required = false) Boolean ativo,
            @RequestParam(required = false) Integer nivel
    ){
        PagedResponseDTO<AventureiroResponseDTO> paged = service.consultarPaginado(page,size,classe,ativo,nivel);
        return ResponseEntity.ok()
                .header("X-Total-Count",String.valueOf(paged.total()))
                .header("X-Page",String.valueOf(paged.page()))
                .header("X-Size",String.valueOf(paged.size()))
                .header("X-Total-Pages",String.valueOf(paged.totalPages()))
                .body(paged);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aventureiro> atualizarDadosDoAventureiro(@PathVariable Long id, @RequestBody @Valid AventureiroUpdateDTO dto){
        Aventureiro aventureiro = service.atualizar(id,dto);
        return ResponseEntity.ok().body(aventureiro);
    }

    @PutMapping("/{id}/guilda/encerrar")
    public ResponseEntity<Aventureiro> encerrarVinculoComGuilda(@PathVariable Long id){
        Aventureiro aventureiro = service.encerrarVinculo(id);
        return ResponseEntity.ok().body(aventureiro);
    }

    @PutMapping("/{id}/guilda/recrutar")
    public ResponseEntity<Aventureiro> recrutarParaGuilda(@PathVariable Long id){
        Aventureiro aventureiro = service.recrutar(id);
        return ResponseEntity.ok().body(aventureiro);
    }

    @PutMapping("/{id}/companheiros")
    public ResponseEntity<Aventureiro> definirCompanheiro(@PathVariable Long id, @RequestBody @Valid CompanheiroDTO dto){
        Aventureiro aventureiro = service.definirCompanheiro(id,dto);
        return ResponseEntity.ok().body(aventureiro);
    }

    @DeleteMapping("/{id}/companheiros")
    public ResponseEntity<Aventureiro> removerCompanheiro(@PathVariable Long id){
        Aventureiro aventureiro = service.removerCompanheiro(id);
        return ResponseEntity.ok().body(aventureiro);
    }


}
