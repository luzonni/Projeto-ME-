package com.zonni.main.modules;

public class EmpregadoHorista extends Empregado {

    private double horasTrabalhadas;
    private double valorHoraTrabalhada;

    public EmpregadoHorista(String nome, String sobrenome, String documento, double horasTrabalhadas, double valorHoraTrabalhada) {
        super(nome, sobrenome, documento);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public double salario() {
        return horasTrabalhadas * valorHoraTrabalhada;
    }
}
