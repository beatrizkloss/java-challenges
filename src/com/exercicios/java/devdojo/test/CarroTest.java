package com.exercicios.java.devdojo.test;

import com.exercicios.java.devdojo.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Ferrari";
        carro.ano = 1962;
        carro.modelo ="250 GTO";

        carro2.nome = "Ferrari";
        carro2.ano = 2013;
        carro2.modelo =  "LaFerrari";

        System.out.println("-----------------");
        System.out.println("Primeiro Carro");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Modelo: " + carro.modelo);

        System.out.println("-----------------");
        System.out.println("Segundo Carro");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);
    }

}
