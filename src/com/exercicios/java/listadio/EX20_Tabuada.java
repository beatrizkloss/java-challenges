package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX20_Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
        sc.close();
    }
}
