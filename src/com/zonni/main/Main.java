package com.zonni.main;

import com.zonni.main.modules.Empregado;
import com.zonni.main.modules.EmpregadoAssalariado;

public class Main {
    public static void main(String[] args) {
        Empregado emp_1 = new EmpregadoAssalariado("Lucas", "Zonzini Lisboa", "485.094.334-89", 768.89);
        System.out.println(emp_1.toString());
    }
}