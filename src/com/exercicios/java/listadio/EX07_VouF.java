package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX07_VouF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'True' Ou 'False' ");
        boolean A = sc.nextBoolean();
        System.out.println("Digite 'True' Ou 'False' ");
        boolean B = sc.nextBoolean();

        if (A && B) {
            System.out.println("Ambos Verdadeiros");
        }else if (!A && !B) {
            System.out.println("Ambos Falsos");
        }else {
            System.out.println("Valores diferentes");
        }
        sc.close();
    }
}
