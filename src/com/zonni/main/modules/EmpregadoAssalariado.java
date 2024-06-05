package com.zonni.main.modules;

import java.text.Format;
import java.util.Formatter;

public class EmpregadoAssalariado extends Empregado {

    private double salario;

    public EmpregadoAssalariado(String nome, String sobrenome, String documento, double salario) {
        super(nome, sobrenome, documento);
        this.salario = salario;
    }

    @Override
    public String toString() {
        String values = super.toString();
        values += "Salario: R$ " + salario() + "\n";
        return values;
    }

    @Override
    public double salario() {
        return salario;
    }
}
