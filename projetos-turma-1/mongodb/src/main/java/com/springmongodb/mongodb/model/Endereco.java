package com.springmongodb.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Endereco {

    @Id
    private Integer id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String uf;
    private String bairro;
    private String localidade;


}
