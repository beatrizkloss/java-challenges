package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX11_Notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();
        System.out.println("Digite a primeria nota");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota");
        double nota4 = sc.nextDouble();

        double media = ( nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println(aluno + " Foi Aprovado(a)");
        }else {
            System.out.println(aluno + " Foi Reprovado(a)");
        }
        sc.close();
    }
}
