package com.zonni.main;

import com.zonni.main.modules.Animal;
import com.zonni.main.modules.Cachorro;
import com.zonni.main.modules.Client;
import com.zonni.main.modules.Gato;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Client client = new Client("Caio", cachorro);
        client.animal.comer();
    }
}