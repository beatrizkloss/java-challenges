package com.exercicios.java.listadio;

import java.util.Scanner;

public class EX12_Produto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento:");
        System.out.println("1: À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int opcao = sc.nextInt();
        double taxa;
        double valorFinal;

        switch (opcao) {
            case 1:
                taxa = valorProduto * 0.15;
                valorFinal = valorProduto - taxa;
                System.out.printf("Seu desconto é de R$%.2f, O total deu R$%.2f", taxa, valorFinal);
                break;
            case 2:
                taxa = valorProduto * 0.10;
                valorFinal = valorProduto - taxa;
                System.out.printf("Seu desconto é de R$%.2f, O total deu R$%.2f", taxa, valorFinal);
                break;
            case 3:
                System.out.printf("O total deu R$%.2f", valorProduto);
                break;
            case 4:
                taxa = valorProduto * 0.10;
                valorFinal = valorProduto + taxa;
                System.out.printf("Seu acréscimo de juros é de R$%.2f, O total deu R$%.2f", taxa, valorFinal);
                break;
            default:
                System.out.println("Opção Inválida!!");
        }
        sc.close();
    }
}
