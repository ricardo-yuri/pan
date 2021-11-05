package com.springmongodb.mongodb.repository;

import com.springmongodb.mongodb.model.Funcionario;
import com.springmongodb.mongodb.model.Telefone;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TelefoneRepository extends MongoRepository<Telefone, Integer> {
}
