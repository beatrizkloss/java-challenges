package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 18 ){
            System.out.println(nome + " você tem " + idade + " você é MENOR de idade");
        }else {
            System.out.println(nome + " você tem " + idade + " você é MAIOR de idade");
        }
        sc.close();
    }
}
