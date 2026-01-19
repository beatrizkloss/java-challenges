package com.exercicios.java.listadio;


import java.util.Scanner;

public class EX24_Combustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite o tempo gasto na viagem (horas): ");
        double tempo = sc.nextDouble();
        System.out.println("Digite a velocidade média (km/h): ");
        double velocidade = sc.nextDouble();


        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.printf("Você percorreu %.1f Km e gastou %.2f litros de gasolina.%n", distancia, litrosUsados);

        sc.close();

    }
}
