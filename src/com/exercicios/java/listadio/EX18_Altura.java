package com.exercicios.java.listadio;

public class EX18_Altura {

    public static void main(String[] args) {

        double fAltura = 1.50;
        double sAltura = 1.10;

        int ano = 0;

        while (sAltura <= fAltura){
            fAltura = fAltura + 0.02;
            sAltura = sAltura + 0.03;
            ano++;
        }
        System.out.println("Sara demorou " + ano + " anos para passar o Francisco");
        System.out.printf("Altura final de Sara foi de %.2f e a de Francisco foi de %.2f", sAltura, fAltura);
    }

}
