package com.springmongodb.mongodb;

import com.mongodb.client.MongoClients;
import com.springmongodb.mongodb.model.Funcionario;
import com.springmongodb.mongodb.repository.FuncionarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.management.Query;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

}
