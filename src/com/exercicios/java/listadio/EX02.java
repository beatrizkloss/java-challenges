package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
        if (N > 0) {
            System.out.println("É Positvo");
        } else if (N < 0) {
            System.out.println("É Negativo");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
