package com.exercicios.java.devdojo.model;

public class ImprimirMedia {
    public void mediaSalario(double... salario){
        if (salario == null) {
            return;
        }
        double soma = 0;
        double media;
        for (double num: salario){
            soma += num;
        }
        media = soma /salario.length;
        System.out.println("Média salarial: " + media);
    }
}
