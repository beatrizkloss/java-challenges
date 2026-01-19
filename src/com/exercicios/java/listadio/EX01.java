package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int C = sc.nextInt();
        int soma = A + B;

        if (soma < C) {
            System.out.println(soma + " É menor que " + C);
        }else {
            System.out.println(soma + " Não é menor que " + C);
        }
        sc.close();
    }
}