package com.springmongodb.mongodb.controller;

import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> findAll(){
        List<Paciente> pacientes = service.findAll();
        return ResponseEntity.ok().body(pacientes);
    }

    //public ResponseEntity<Paciente> find


}
