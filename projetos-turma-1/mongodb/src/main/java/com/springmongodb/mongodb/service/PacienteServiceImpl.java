package com.springmongodb.mongodb.service;

import com.springmongodb.mongodb.controller.PacienteController;
import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> findAll(){
        List<Paciente> pacientes = this.pacienteRepository.findAll();
        if(pacientes.isEmpty()){
            new RuntimeException("Nenhum paciente encontrado");
        }
        return pacientes;
    }

}
