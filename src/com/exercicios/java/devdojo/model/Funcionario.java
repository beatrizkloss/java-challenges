package com.exercicios.java.devdojo.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salario){
            System.out.println(salario);
        }
    }
}
