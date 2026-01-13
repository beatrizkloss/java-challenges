package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX04_Inteiros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = sc.nextInt();
        int antecessor, sucessor;

        sucessor = N + 1;
        antecessor = N - 1;

        System.out.println("sucessor: " + sucessor );
        System.out.println("antecessor: " + antecessor);

    }
}
