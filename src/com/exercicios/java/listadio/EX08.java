package com.exercicios.java.listadio;

import java.util.Arrays;
import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int N1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int N2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int N3 = sc.nextInt();
        int[] decrescente = {N1, N2, N3};
        Arrays.sort(decrescente);

        for (int i = decrescente.length - 1; i >= 0; i--) {
            System.out.println(decrescente[i]);
        }
        sc.close();
    }
}
