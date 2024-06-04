package com.zonni.main.modules;

public class Cachorro extends Animal{

    public Cachorro() {
        this.nome = "cachorro";
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo de cabeça para baixo!");
    }

}
