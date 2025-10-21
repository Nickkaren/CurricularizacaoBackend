package com.example.sospets.services.impl;

import com.example.sospets.repositories.FuncionarioRepo;
import com.example.sospets.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepo repository;
}
