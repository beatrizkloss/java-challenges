package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("------ 1º BIMESTRE -----");
        System.out.println("-------------------------");
        System.out.println("Digite a primeira nota: ");
        double N1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double N2 = sc.nextDouble();

        System.out.println("\n----- 2º BIMESTRE -----");
        System.out.println("-------------------------");
        System.out.println("Digite a primeira nota: ");
        double N3 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double N4 = sc.nextDouble();

        double media;
        media = (N1 + N2 + N3 + N4) /4;

        System.out.printf("A nota Semestral do aluno é de %.2f: ", media);
        sc.close();
    }
}
