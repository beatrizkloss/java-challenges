package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX06_Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Valor: ");
        double valor = sc.nextDouble();
        double reajuste = valor * 0.05;
        double resultado = valor + reajuste;

        System.out.printf("O valor final com reajuste é: %.2f", resultado);
        sc.close();
    }
}
