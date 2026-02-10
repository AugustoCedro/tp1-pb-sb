package com.example.demo.controller;

import com.example.demo.dto.AventureiroDTO;
import com.example.demo.model.Aventureiro;
import com.example.demo.service.AventureiroService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aventureiros")
@AllArgsConstructor
public class AventureiroController {

    private AventureiroService service;

    @PostMapping
    public ResponseEntity<Aventureiro> registrarAventureiro(@RequestBody @Valid AventureiroDTO dto){
        Aventureiro aventureiro = service.registrar(dto);
        return ResponseEntity.ok(aventureiro);
    }

}
