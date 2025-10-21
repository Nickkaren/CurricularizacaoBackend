package com.example.sospets.services.impl;

import com.example.sospets.repositories.ClinicaRepo;
import com.example.sospets.services.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicaServiceImpl implements ClinicaService {

    @Autowired
    private ClinicaRepo repository;
}
