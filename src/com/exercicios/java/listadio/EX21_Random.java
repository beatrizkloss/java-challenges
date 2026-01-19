package com.exercicios.java.listadio;

import java.util.Random;

public class EX21_Random {
    public static void main(String[] args) {

        Random gerador = new Random();

        int numeroAleatorio = gerador.nextInt(101);

        System.out.println("Número sorteado: " + numeroAleatorio);
    }
}
