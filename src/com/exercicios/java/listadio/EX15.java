package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2026 - anoNascimento;
        int dias = idade * 365;
        int meses = idade * 12;

        System.out.println("Você viveu " + idade + " anos " + meses + " meses " + dias + " dias de vida");

        sc.close();
    }

}
