package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo");
        int lA = sc.nextInt();
        System.out.println("Digite o segundo lado do triângulo");
        int lB = sc.nextInt();
        System.out.println("Digite o terceiro lado do triângulo");
        int lC = sc.nextInt();

        int perimetro = lA + lB +lC;

        System.out.println("O perímetro do triângulo é " + perimetro);
        sc.close();
    }
}
