package com.zonni.main.modules;

public class Gato extends  Animal {

    public Gato() {
        this.nome = "Gato";
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo de cabeça para baixo!");
    }

}
