package com.example.sospets.controllers;

import com.example.sospets.services.ServicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servicos")
public class ServicoController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ServicoService service;
}
