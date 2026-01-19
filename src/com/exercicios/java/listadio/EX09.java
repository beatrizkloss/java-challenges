package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura");

        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal(parabéns");
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        }else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}
