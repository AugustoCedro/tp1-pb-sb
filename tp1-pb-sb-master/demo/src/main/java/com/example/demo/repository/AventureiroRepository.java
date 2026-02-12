package com.example.demo.repository;

import com.example.demo.dto.AventureiroResponseDTO;
import com.example.demo.dto.AventureiroUpdateDTO;
import com.example.demo.exceptions.AventureiroNotFoundException;
import com.example.demo.exceptions.InvalidClassException;
import com.example.demo.model.Aventureiro;
import com.example.demo.model.Classe;
import com.example.demo.model.Companheiro;
import com.example.demo.model.Especie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class AventureiroRepository {
    private final List<Aventureiro> aventureiros = new ArrayList<>();

    public AventureiroRepository() {
        aventureiros.add(new Aventureiro("Arthas", Classe.GUERREIRO, 10));
        aventureiros.add(new Aventureiro("Lyra", Classe.MAGO, 12));
        aventureiros.add(new Aventureiro("Thorn", Classe.ARQUEIRO, 8));
        aventureiros.add(new Aventureiro("Mira", Classe.CLERIGO, 15));
        aventureiros.add(new Aventureiro("Doran", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Kael", Classe.MAGO, 9));
        aventureiros.add(new Aventureiro("Ragnar", Classe.GUERREIRO, 18));
        aventureiros.add(new Aventureiro("Sylvi", Classe.ARQUEIRO, 7));
        aventureiros.add(new Aventureiro("Borin", Classe.GUERREIRO, 14));
        aventureiros.add(new Aventureiro("Elora", Classe.CLERIGO, 11));
        aventureiros.add(new Aventureiro("Fenrir", Classe.GUERREIRO, 16));
        aventureiros.add(new Aventureiro("Aeris", Classe.MAGO, 13));
        aventureiros.add(new Aventureiro("Galen", Classe.GUERREIRO, 17));
        aventureiros.add(new Aventureiro("Nyx", Classe.LADINO, 19));
        aventureiros.add(new Aventureiro("Orin", Classe.GUERREIRO, 6));
        aventureiros.add(new Aventureiro("Vex", Classe.LADINO, 10));
        aventureiros.add(new Aventureiro("Talia", Classe.CLERIGO, 9));
        aventureiros.add(new Aventureiro("Drako", Classe.GUERREIRO, 22));
        aventureiros.add(new Aventureiro("Luna", Classe.MAGO, 15));
        aventureiros.add(new Aventureiro("Korin", Classe.GUERREIRO, 5));
        aventureiros.add(new Aventureiro("Zarek", Classe.LADINO, 14));
        aventureiros.add(new Aventureiro("Helga", Classe.GUERREIRO, 12));
        aventureiros.add(new Aventureiro("Iris", Classe.CLERIGO, 8));
        aventureiros.add(new Aventureiro("Balthor", Classe.GUERREIRO, 21));
        aventureiros.add(new Aventureiro("Soren", Classe.ARQUEIRO, 11));
        aventureiros.add(new Aventureiro("Kaida", Classe.MAGO, 18));
        aventureiros.add(new Aventureiro("Ulric", Classe.GUERREIRO, 13));
        aventureiros.add(new Aventureiro("Nora", Classe.CLERIGO, 7));
        aventureiros.add(new Aventureiro("Torin", Classe.GUERREIRO, 16));
        aventureiros.add(new Aventureiro("Eldrin", Classe.MAGO, 19));
        aventureiros.add(new Aventureiro("Fiora", Classe.LADINO, 14));
        aventureiros.add(new Aventureiro("Grum", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Selene", Classe.CLERIGO, 17));
        aventureiros.add(new Aventureiro("Varis", Classe.ARQUEIRO, 12));
        aventureiros.add(new Aventureiro("Riven", Classe.GUERREIRO, 9));
        aventureiros.add(new Aventureiro("Alaric", Classe.GUERREIRO, 23));
        aventureiros.add(new Aventureiro("Nyra", Classe.MAGO, 10));
        aventureiros.add(new Aventureiro("Brakk", Classe.GUERREIRO, 15));
        aventureiros.add(new Aventureiro("Loric", Classe.GUERREIRO, 8));
        aventureiros.add(new Aventureiro("Myra", Classe.CLERIGO, 11));
        aventureiros.add(new Aventureiro("Drogan", Classe.GUERREIRO, 18));
        aventureiros.add(new Aventureiro("Xara", Classe.LADINO, 16));
        aventureiros.add(new Aventureiro("Thalia", Classe.ARQUEIRO, 13));
        aventureiros.add(new Aventureiro("Grom", Classe.GUERREIRO, 19));
        aventureiros.add(new Aventureiro("Eira", Classe.MAGO, 7));
        aventureiros.add(new Aventureiro("Jorin", Classe.GUERREIRO, 14));
        aventureiros.add(new Aventureiro("Lethra", Classe.CLERIGO, 12));
        aventureiros.add(new Aventureiro("Korvak", Classe.GUERREIRO, 21));
        aventureiros.add(new Aventureiro("Zara", Classe.LADINO, 15));
        aventureiros.add(new Aventureiro("Torek", Classe.GUERREIRO, 17));
        aventureiros.add(new Aventureiro("Velia", Classe.MAGO, 9));
        aventureiros.add(new Aventureiro("Rokar", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Syla", Classe.ARQUEIRO, 11));
        aventureiros.add(new Aventureiro("Borin II", Classe.GUERREIRO, 18));
        aventureiros.add(new Aventureiro("Elric", Classe.MAGO, 22));
        aventureiros.add(new Aventureiro("Hilda", Classe.CLERIGO, 16));
        aventureiros.add(new Aventureiro("Krag", Classe.GUERREIRO, 19));
        aventureiros.add(new Aventureiro("Nyssa", Classe.LADINO, 13));
        aventureiros.add(new Aventureiro("Thorin", Classe.GUERREIRO, 24));
        aventureiros.add(new Aventureiro("Ayla", Classe.ARQUEIRO, 12));
        aventureiros.add(new Aventureiro("Mordek", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Seraph", Classe.CLERIGO, 15));
        aventureiros.add(new Aventureiro("Drax", Classe.GUERREIRO, 17));
        aventureiros.add(new Aventureiro("Liora", Classe.MAGO, 14));
        aventureiros.add(new Aventureiro("Garruk", Classe.GUERREIRO, 21));
        aventureiros.add(new Aventureiro("Vera", Classe.ARQUEIRO, 9));
        aventureiros.add(new Aventureiro("Tyrus", Classe.GUERREIRO, 18));
        aventureiros.add(new Aventureiro("Kira", Classe.LADINO, 16));
        aventureiros.add(new Aventureiro("Orlak", Classe.GUERREIRO, 23));
        aventureiros.add(new Aventureiro("Ilyra", Classe.CLERIGO, 11));
        aventureiros.add(new Aventureiro("Barek", Classe.GUERREIRO, 19));
        aventureiros.add(new Aventureiro("Zorin", Classe.GUERREIRO, 22));
        aventureiros.add(new Aventureiro("Faye", Classe.MAGO, 13));
        aventureiros.add(new Aventureiro("Grendel", Classe.GUERREIRO, 25));
        aventureiros.add(new Aventureiro("Nyel", Classe.ARQUEIRO, 15));
        aventureiros.add(new Aventureiro("Koriel", Classe.CLERIGO, 12));
        aventureiros.add(new Aventureiro("Darian", Classe.GUERREIRO, 17));
        aventureiros.add(new Aventureiro("Selric", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Mythra", Classe.MAGO, 18));
        aventureiros.add(new Aventureiro("Branor", Classe.GUERREIRO, 21));
        aventureiros.add(new Aventureiro("Varyn", Classe.LADINO, 14));
        aventureiros.add(new Aventureiro("Elowen", Classe.ARQUEIRO, 16));
        aventureiros.add(new Aventureiro("Torvald", Classe.GUERREIRO, 23));
        aventureiros.add(new Aventureiro("Ivara", Classe.CLERIGO, 19));
        aventureiros.add(new Aventureiro("Kroth", Classe.GUERREIRO, 24));
        aventureiros.add(new Aventureiro("Zyra", Classe.MAGO, 11));
        aventureiros.add(new Aventureiro("Drel", Classe.LADINO, 15));
        aventureiros.add(new Aventureiro("Baldric", Classe.GUERREIRO, 22));
        aventureiros.add(new Aventureiro("Nyara", Classe.ARQUEIRO, 13));
        aventureiros.add(new Aventureiro("Rurik", Classe.GUERREIRO, 20));
        aventureiros.add(new Aventureiro("Selka", Classe.CLERIGO, 17));
        aventureiros.add(new Aventureiro("Gorim", Classe.GUERREIRO, 18));
        aventureiros.add(new Aventureiro("Liora II", Classe.MAGO, 14));
        aventureiros.add(new Aventureiro("Varok", Classe.GUERREIRO, 25));
        aventureiros.add(new Aventureiro("Zerin", Classe.LADINO, 19));
        aventureiros.add(new Aventureiro("Aerin", Classe.ARQUEIRO, 16));
        aventureiros.add(new Aventureiro("Thorg", Classe.GUERREIRO, 21));
        aventureiros.add(new Aventureiro("Elric II", Classe.MAGO, 23));
        aventureiros.add(new Aventureiro("Aerinida", Classe.ARQUEIRO, 29));
        aventureiros.add(new Aventureiro("Thorgun", Classe.GUERREIRO, 212));

        aventureiros.get(1).setCompanheiro(new Companheiro("Fen", Especie.LOBO, 85));
        aventureiros.get(2).setCompanheiro(new Companheiro("Noctis", Especie.CORUJA, 70));
        aventureiros.get(5).setCompanheiro(new Companheiro("Pedregulho", Especie.GOLEM, 95));
        aventureiros.get(7).setCompanheiro(new Companheiro("Ash", Especie.DRAGAO_MINIATURA, 90));
        aventureiros.get(10).setCompanheiro(new Companheiro("Lupin", Especie.LOBO, 80));
        aventureiros.get(13).setCompanheiro(new Companheiro("Olhosombra", Especie.CORUJA, 75));
        aventureiros.get(15).setCompanheiro(new Companheiro("Granitus", Especie.GOLEM, 88));
        aventureiros.get(18).setCompanheiro(new Companheiro("Pyro", Especie.DRAGAO_MINIATURA, 92));
        aventureiros.get(22).setCompanheiro(new Companheiro("Alfa", Especie.LOBO, 78));
        aventureiros.get(25).setCompanheiro(new Companheiro("Luna", Especie.CORUJA, 83));
        aventureiros.get(28).setCompanheiro(new Companheiro("Rochoso", Especie.GOLEM, 91));
        aventureiros.get(31).setCompanheiro(new Companheiro("Smolder", Especie.DRAGAO_MINIATURA, 87));
        aventureiros.get(34).setCompanheiro(new Companheiro("Fang", Especie.LOBO, 76));
        aventureiros.get(37).setCompanheiro(new Companheiro("Vigia", Especie.CORUJA, 82));
        aventureiros.get(40).setCompanheiro(new Companheiro("Titan", Especie.GOLEM, 97));
        aventureiros.get(43).setCompanheiro(new Companheiro("Ember", Especie.DRAGAO_MINIATURA, 89));
        aventureiros.get(47).setCompanheiro(new Companheiro("Ghost", Especie.LOBO, 84));
        aventureiros.get(50).setCompanheiro(new Companheiro("Aurora", Especie.CORUJA, 77));
        aventureiros.get(53).setCompanheiro(new Companheiro("Basalto", Especie.GOLEM, 93));
        aventureiros.get(56).setCompanheiro(new Companheiro("Flare", Especie.DRAGAO_MINIATURA, 86));
        aventureiros.get(60).setCompanheiro(new Companheiro("Ragnarok", Especie.LOBO, 90));
        aventureiros.get(63).setCompanheiro(new Companheiro("Sentinela", Especie.CORUJA, 79));
        aventureiros.get(66).setCompanheiro(new Companheiro("Colosso", Especie.GOLEM, 96));
        aventureiros.get(69).setCompanheiro(new Companheiro("Drift", Especie.DRAGAO_MINIATURA, 85));
        aventureiros.get(72).setCompanheiro(new Companheiro("Caçador", Especie.LOBO, 81));
        aventureiros.get(75).setCompanheiro(new Companheiro("Eclipse", Especie.CORUJA, 88));
        aventureiros.get(78).setCompanheiro(new Companheiro("Granito", Especie.GOLEM, 94));
        aventureiros.get(81).setCompanheiro(new Companheiro("Inferno", Especie.DRAGAO_MINIATURA, 91));
        aventureiros.get(85).setCompanheiro(new Companheiro("Shadow", Especie.LOBO, 83));
        aventureiros.get(88).setCompanheiro(new Companheiro("Oráculo", Especie.CORUJA, 80));
        aventureiros.get(91).setCompanheiro(new Companheiro("Monólito", Especie.GOLEM, 98));
        aventureiros.get(95).setCompanheiro(new Companheiro("Cinder", Especie.DRAGAO_MINIATURA, 87));
    }

    public void adicionar(Aventureiro aventureiro) {
        aventureiros.add(aventureiro);
    }

    public Aventureiro consultarPorId(Long id) {
        return aventureiros.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new AventureiroNotFoundException("Aventureiro com ID " + id + " não encontrado"));
    }

    public List<Aventureiro> consultarPaginado(String classe, Boolean ativo, Integer nivel) {
        return aventureiros.stream()
                .filter(a -> classe == null || a.getClasse().equals(isClasseValid(classe)))
                .filter(a -> ativo == null || a.getAtivo().equals(ativo))
                .filter(a -> nivel == null || a.getNivel() >=  nivel)
                .toList();
    }

    public Aventureiro atualizar(Long id, AventureiroUpdateDTO dto) {
        Aventureiro aventureiro = consultarPorId(id);

        Optional.ofNullable(dto.nome()).ifPresent(aventureiro::setNome);
        Optional.ofNullable(dto.nivel()).ifPresent(aventureiro::setNivel);
        Optional.ofNullable(dto.classe())
                .map(this::isClasseValid)
                .ifPresent(aventureiro::setClasse);

        return aventureiro;
    }

    private Classe isClasseValid(String classe){
        return Arrays.stream(Classe.values())
                .filter(c -> c.name().equalsIgnoreCase(String.valueOf(classe)))
                .findFirst().orElseThrow(() -> new InvalidClassException("Classe inválida"));
    }


}
