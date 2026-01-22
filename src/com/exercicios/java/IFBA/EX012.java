package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Informe a velocidade em m/s: ");
        double ms = sc.nextDouble();

        double kmh = ms * 3.6;

        System.out.printf("A velocidade %.2f convertida em kmh fica: %.2f", ms, kmh);
        sc.close();
    }
}
