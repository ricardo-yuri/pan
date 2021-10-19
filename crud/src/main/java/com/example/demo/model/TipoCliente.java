package com.example.demo.model;

public enum TipoCliente {


    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIFICA(2, "Pessoa Jurídica");
    private int cod;
    private String nome;

    TipoCliente(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public static TipoCliente toEnum(TipoCliente cod) {
        if(cod == null) {
            return null;
        }
        for (TipoCliente nomeEnum : TipoCliente.values()){
            if(cod.equals(nomeEnum.getCod())){
                return nomeEnum;
            }
        }
        throw new IllegalArgumentException("Id inválido : " + cod);
    }
}
