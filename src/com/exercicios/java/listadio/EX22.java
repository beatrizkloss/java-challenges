package com.exercicios.java.listadio;


import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int N1 = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int N2 = sc.nextInt();


        if (N2 != 0){
            int quociente = N1 / N2;
            int resto = N1 % N2;
            System.out.println("O quociente é " + quociente + " e o resto da divisão é " + resto);
        }else{
            System.out.println("Não é possivel dividir por zero");
        }
        sc.close();
    }
}
