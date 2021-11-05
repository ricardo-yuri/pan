package com.springmongodb.mongodb.repository;

import com.springmongodb.mongodb.model.Funcionario;
import com.springmongodb.mongodb.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, Integer> {
}
