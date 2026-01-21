package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite o raio do círculo");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("A área do Circulo é %.2f, e o perímetro é %.2f%n", area, perimetro);
        sc.close();
    }
}
