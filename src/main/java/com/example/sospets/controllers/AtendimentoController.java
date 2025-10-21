package com.example.sospets.controllers;

import com.example.sospets.entities.Atendimento;
import com.example.sospets.services.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class AtendimentoController {

    @Autowired
    private AtendimentoService service;

    @PostMapping
    public ResponseEntity<Atendimento> create(@RequestBody Atendimento atendimento) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(service.create(atendimento).getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
