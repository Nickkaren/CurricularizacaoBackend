package com.example.sospets.controllers;

import com.example.sospets.services.ClinicaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clínicas")
public class ClinicaController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ClinicaService service;
}
