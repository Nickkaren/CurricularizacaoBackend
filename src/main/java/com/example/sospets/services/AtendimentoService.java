package com.example.sospets.services;

import com.example.sospets.entities.Atendimento;

import java.util.List;

public interface AtendimentoService {
    Atendimento create(Atendimento atendimento);
    List<Atendimento> findAll();
}
