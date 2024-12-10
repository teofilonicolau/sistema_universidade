package com.example.universidadesistema.model;



import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (!departamentos.contains(departamento)) {
            departamentos.add(departamento);
        }
    }
}
