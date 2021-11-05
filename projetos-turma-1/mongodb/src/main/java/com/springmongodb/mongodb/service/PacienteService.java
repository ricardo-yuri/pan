package com.springmongodb.mongodb.service;

import com.springmongodb.mongodb.model.Paciente;

import java.util.List;

public interface PacienteService {

    List<Paciente> findAll();
}
