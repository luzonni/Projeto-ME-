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
    public String toString() {
        String values = super.toString();
        values += "Salario: R$ " + salario() + "\n";
        return values;
    }

    @Override
    public double salario() {
        if(horasTrabalhadas < 40) {
            return horasTrabalhadas * valorHoraTrabalhada;
        }else {
            return 40*valorHoraTrabalhada + (horasTrabalhadas - 40)*valorHoraTrabalhada*1.5;
        }
    }
}
