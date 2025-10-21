package com.example.sospets.services.impl;

import com.example.sospets.repositories.TipoServicoRepo;
import com.example.sospets.services.TipoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoServicoServiceImpl implements TipoServicoService {

    @Autowired
    private TipoServicoRepo repository;
}
