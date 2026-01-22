package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite o Raio: ");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        double volumeOleo;

        volumeOleo = Math.PI * (raio * raio) * altura;

        System.out.printf("O volume da lata de oleo é: %.2f cm³%n", volumeOleo);
        sc.close();

    }
}
