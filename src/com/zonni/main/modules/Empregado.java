package com.zonni.main.modules;

public abstract class Empregado {

    private String nome, sobrenome;
    private String documento;

    public Empregado(String nome, String sobrenome, String documento) {
        setEmpregado(nome, sobrenome, documento);
    }

    private void setEmpregado(String nome, String sobrenome, String documento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }

    @Override
    public String toString() {
        String values = "";
        values += "Nome: " + nome + "\n";
        values += "Sobrenome: " + sobrenome + "\n";
        values += "Documento: " + documento + "\n";
        return values;
    }

    public abstract double salario();
}
