package com.exercicios.java.listadio;

import java.util.Arrays;
import java.util.Scanner;

public class EX08_Decrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int N2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int N3 = sc.nextInt();
        int[] decrescente = {N1, N2, N3};
        Arrays.sort(decrescente);

        for (int i = decrescente.length - 1; i >= 0; i--) {
            System.out.println(decrescente[i]);
        }
        sc.close();
    }
}
