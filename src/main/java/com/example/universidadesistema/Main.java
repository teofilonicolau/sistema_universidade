package com.example.universidadesistema;



import com.example.universidadesistema.model.Departamento;
import com.example.universidadesistema.model.Disciplina;
import com.example.universidadesistema.model.Professor;
import com.example.universidadesistema.model.Universidade;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade ABC");

        Departamento departamento = new Departamento("Departamento de Ciências");
        universidade.adicionarDepartamento(departamento);

        Professor professor = new Professor("Dr. João");
        departamento.adicionarProfessor(professor);

        Disciplina disciplina = new Disciplina("Matemática");
        professor.adicionarDisciplina(disciplina);

        // Exibir estrutura
        System.out.println("Universidade: " + universidade.getNome());
        for (Departamento dept : universidade.getDepartamentos()) {
            System.out.println("  Departamento: " + dept.getNome());
            for (Professor prof : dept.getProfessores()) {
                System.out.println("    Professor: " + prof.getNome());
                for (Disciplina disc : prof.getDisciplinas()) {
                    System.out.println("      Disciplina: " + disc.getNome());
                }
            }
        }
    }
}
