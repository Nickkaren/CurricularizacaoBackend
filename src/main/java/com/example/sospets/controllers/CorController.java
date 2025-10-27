package com.example.sospets.controllers;

import com.example.sospets.services.CorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cor")
public class CorController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CorService service;
}
