package com.exercicios.java.devdojo.test;

import com.exercicios.java.devdojo.model.Funcionario;
import com.exercicios.java.devdojo.model.ImprimirMedia;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImprimirMedia imprimirmedia = new ImprimirMedia();

        funcionario.nome = "Beatriz";
        funcionario.idade = 24;
        funcionario.salario = new double [] {1500.0, 2400.0, 5900.0};


        System.out.println("---------------------");
        funcionario.imprimir();
        imprimirmedia.mediaSalario(funcionario.salario);
        System.out.println("---------------------");

    }
}
