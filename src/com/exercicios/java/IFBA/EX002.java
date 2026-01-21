package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Lado do Quadrado");
        int lado = sc.nextInt();

        int area = lado * lado;
        int perimetro = lado * 4;

        System.out.println("A área do Quadrado é " + area + " e seu perímetro é " + perimetro);
        sc.close();
    }
}
