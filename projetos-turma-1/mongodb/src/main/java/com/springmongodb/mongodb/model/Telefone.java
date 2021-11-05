package com.springmongodb.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Telefone {

    private Integer id;
    private Integer ddd;
    private Integer numero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
