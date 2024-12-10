package com.example.universidadesistema.model;



import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Professor> professores;

    public Departamento(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
    }
}
