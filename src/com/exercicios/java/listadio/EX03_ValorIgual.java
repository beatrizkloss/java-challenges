package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX03_ValorIgual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int A = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int B = sc.nextInt();
        int C;

        if (A == B) {
            C = A + B;
            System.out.println("A Soma de  " +A + " + " + B + " = " + C);
        }else {
            C = A * B;
            System.out.println("A multiplicação" + A + " e " + B + " = " + C);
        }
        sc.close();
    }
}
