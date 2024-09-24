/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rwsouza
 */
public class Turma {
   private String disciplina;
   private Turno turno;
   private Professor professor;
   private ArrayList<Aluno> alunos = new ArrayList<>();

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
   
    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
        Aluno alunoMaiorNota = alunos.get(0);
        
        for (Aluno alu : alunos){
            if (alu.getNotaEnem() > alunoMaiorNota.getNotaEnem()){
               alunoMaiorNota = alu;   
            }
        }
        
        return alunoMaiorNota;
    }
    
   
   
   
}
