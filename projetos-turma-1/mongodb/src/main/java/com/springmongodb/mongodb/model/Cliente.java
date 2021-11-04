package com.springmongodb.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Cliente {

    @MongoId
    private Integer id;
    private String nome;
}
