package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A sua media é %.2f", media);
        sc.close();
    }
}
