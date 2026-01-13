package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX05_Salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite seu salário: ");
        double salUsuario = sc.nextDouble();
        double salMin = 1293.20;

        double calculo = salUsuario / salMin;
        System.out.printf("São: %.2f salarios mínimos", calculo);
    }
}
