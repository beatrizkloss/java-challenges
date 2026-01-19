package com.exercicios.java.listadio;

public class EX19_Tabuadas {
    public static void main(String[] args) {

        int numero = 1;

        while( numero < 11) {
            for (int i = 1; i <= 10; i++){
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
            System.out.println();
            numero++;
        }
    }
}
