package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX23_SalarioLiquido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite o número de aulas lecionadas no mês");
        int aulas = sc.nextInt();
        System.out.println("Digite o perceltual do desconto do Inss: ");
        double inss = sc.nextDouble();

        double salarioBruto = valorHora * aulas;
        double desconto = salarioBruto * (inss / 100);
        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
