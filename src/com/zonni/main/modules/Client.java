package com.zonni.main.modules;

public class Client {

    public String nome;
    public Animal animal;

    public Client(String nome, Animal animal) {
        this.nome = nome;
        this.animal = animal;
    }

    public String animal() {
        return this.animal.nome();
    }


}
