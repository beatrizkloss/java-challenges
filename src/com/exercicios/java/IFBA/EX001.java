package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da Base");
        int base = sc.nextInt();
        System.out.println("Digite o valor da Altura");
        int altura = sc.nextInt();

        int area = base * altura;
        int perimetro = 2 * (base + altura);

        System.out.println("A área do Retângulo é " + area + " e seu perímetro é " + perimetro);
        sc.close();
    }
}
