package com.example.sospets.services.impl;

import com.example.sospets.entities.Atendimento;
import com.example.sospets.repositories.AtendimentoRepo;
import com.example.sospets.services.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoServiceImpl implements AtendimentoService {

    @Autowired
    private AtendimentoRepo repository;


    @Override
    public Atendimento create(Atendimento atendimento) {
        return repository.save(atendimento);
    }

    public List<Atendimento> findAll() {
        return repository.findAll();
    }

}
