package com.example.demo.service;

import com.example.demo.dto.AventureiroDTO;
import com.example.demo.model.Aventureiro;
import org.springframework.stereotype.Service;

@Service
public class AventureiroService {

    public Aventureiro registrar(AventureiroDTO dto){
        return new Aventureiro(dto.nome(), dto.classe(), dto.nivel());
    }


}
