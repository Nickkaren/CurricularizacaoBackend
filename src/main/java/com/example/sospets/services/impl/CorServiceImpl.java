package com.example.sospets.services.impl;

import com.example.sospets.repositories.CorRepo;
import com.example.sospets.services.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorServiceImpl implements CorService {

    @Autowired
    private CorRepo repository;
}
