package com.exercicios.java.IFBA;

import java.util.Scanner;

public class EX010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 32 para ver a conversão em binário: ");
        int num = sc.nextInt();
        StringBuilder binario = new StringBuilder();

        if (num == 0){
            System.out.println("O número 0 em binário é: 0");
        }else if(num > 0 && num <= 32) {
            int temp = num;
            while (temp > 0) {
                int resto = temp % 2;
                binario.insert(0, resto);
                temp = temp / 2;
            }
            System.out.println("O número " + num + " em binário é: " + binario.toString());
        }else {
            System.out.println("O número digitado não está entre 0 e 32.");
        }

        sc.close();
    }
}
