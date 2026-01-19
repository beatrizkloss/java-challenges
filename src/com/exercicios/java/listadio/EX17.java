package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("*-----------------------------------------------*");
        System.out.println("Conversão de temperatura, Fahrenheit - Celsius");
        System.out.println("Informe a temperatura em Fahrenheit");
        double F = sc.nextInt();

        double C = 5 * (F - 32) / 9;

        System.out.printf("Temperatura em Fahrenheit é %.2f%n", F);
        System.out.printf("Temperatura em Celsius é %.2f", C);

        sc.close();
    }
}
