package com.pan.appcrud.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_maintenance")
public class Maintenance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_maintenance")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dia")
    private Date dia;
    @Column(name = "valor")
    private double valor;

    public Maintenance(){

    }

    public Maintenance(Integer id, String nome, Date dia, double valor) {
        this.id = id;
        this.nome = nome;
        this.dia = dia;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
