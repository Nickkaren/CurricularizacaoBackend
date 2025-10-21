package com.example.sospets.services.impl;

import com.example.sospets.repositories.ServicoRepo;
import com.example.sospets.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoServiceImpl implements ServicoService {

    @Autowired
    private ServicoRepo repository;
}
