package com.exercicios.java.devdojo.test;

import com.exercicios.java.devdojo.model.Aluno;
import com.exercicios.java.devdojo.model.Local;
import com.exercicios.java.devdojo.model.Professor;
import com.exercicios.java.devdojo.model.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {

        Local local = new Local ("Avenida das Garças");
        Aluno aluno = new Aluno("Beatriz", 24);
        Professor professor = new Professor("Juliana", "Cientista de Dados");

        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("AI Revolution: Inteligência Artificial na Prática", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();


    }
}
