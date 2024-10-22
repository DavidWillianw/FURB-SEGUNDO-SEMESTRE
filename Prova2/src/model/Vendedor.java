/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author sunse
 */
public class Vendedor extends Pessoa{
    
    private double percentualComissao;
    
    public Vendedor(String nome, LocalDate DataNascimento, double percentualComissao){
        super(nome,DataNascimento);
        this.percentualComissao = percentualComissao;        
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
