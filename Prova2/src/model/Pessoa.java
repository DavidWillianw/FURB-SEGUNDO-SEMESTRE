/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sunse
 */
public class Pessoa {
    
    private String nome;
    private LocalDate dataDeNascimento;
    private LocalDate Moth;
    
     public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        if(dataDeNascimento == null){
            throw new IllegalArgumentException("Valor inválido.");
        }
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getMoth() {
        return Moth;
    }

    public void setMoth(LocalDate Moth) {
        this.Moth = Moth;
    }

    public boolean isMesAniversario() {
        LocalDate hoje = LocalDate.now();
        Month mesAtual = hoje.getMonth();
        Month mesAniversario = dataDeNascimento.getMonth();
        return mesAtual.equals(mesAniversario);
    }

        
            }

