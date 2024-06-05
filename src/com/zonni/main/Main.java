package com.zonni.main;

import com.zonni.main.modules.Empregado;
import com.zonni.main.modules.EmpregadoAssalariado;
import com.zonni.main.modules.EmpregadoHorista;

public class Main {
    public static void main(String[] args) {
        Empregado emp_1 = new EmpregadoAssalariado("Lucas", "Zonzini Lisboa", "485.094.334-89", 768.89);
        System.out.println(emp_1.toString());
        Empregado emp_2 = new EmpregadoHorista("Pedro", "Miguel Santos", "383.957.038-98", 36*4, 45.32/8);
        System.out.println(emp_2.toString());
        if(emp_2 instanceof EmpregadoHorista) {
            System.out.println("Neste codigo, a variavel emp_2 é um EmpregadoHorista");
        }
    }
}