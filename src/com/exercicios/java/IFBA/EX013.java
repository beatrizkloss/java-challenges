package com.exercicios.java.IFBA;


import java.util.Scanner;

public class EX013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite valor da  primeira Resistencia: ");
        double r1 = sc.nextDouble();
        System.out.println("Digite o valor da segunda Resistencia: ");
        double r2 = sc.nextDouble();
        System.out.println("Digite o valor da terceira Resistencia: ");
        double r3 = sc.nextDouble();


        double rParalelo = (r1 * r2) / (r1 + r2);
        double rTotal =  rParalelo + r3;

        System.out.printf("A resistencia equivalente a essse circuito é %.2f: ", rTotal);

        sc.close();
    }
}
