package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo nÚmero");
        int B = sc.nextInt();
        int C = A;
        A = B;
        B = C;

        System.out.println("O primeiro número foi trocado pelo segundo: " + A);
        System.out.println("O segundo número foi trocado pelo primeiro: " + B);
        sc.close();
    }
}
