package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX16_Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado A do triângulo: ");
        int ladoA = sc.nextInt();
        System.out.println("Digite o lado B do triângulo: ");
        int ladoB = sc.nextInt();
        System.out.println("Digite o lado C do triângulo: ");
        int ladoC = sc.nextInt();

        if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            if(ladoA == ladoB && ladoB == ladoC) {
                System.out.println("É um Triângulo Equilátero");
            }
            else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC ){
                System.out.println("É um Triângulo Escaleno");
            }
            else {
                System.out.println("É um Triângulo Isósceles");
            }
        } else {
            System.out.println("Não é um Triângulo!");
        }
        sc.close();
    }
}