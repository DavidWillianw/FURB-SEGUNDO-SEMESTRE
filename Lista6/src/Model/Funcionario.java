/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import java.text.DecimalFormat;

/**
 *
 * @author sunse
 */
public class Funcionario {
    
    DecimalFormat df = new DecimalFormat("0.00");

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
   
    public String calcularIRPF() {
        double irpf ;
        if (getSalario() <= 1903.98) {
            irpf = 0.0;
        } else if (getSalario() <= 2826.65) {
            // Poderia também fazer 
            // diferenca = 1903.98 * (7.5/100); 
            df.format(irpf = (getSalario() - 1903.98) * 0.075);
        } else if (getSalario() <= 3751.05) {

            df.format(irpf = (2826.65 - 1903.98) * 0.075 + (getSalario() - 2826.65) * 0.15);
        } else if (getSalario() <= 4664.68) {

            df.format(irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (getSalario() - 3751.05) * 0.225);
        } else {

            df.format(irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (getSalario() - 4664.68) * 0.275);
        }
        System.out.print("O imposto é "+ irpf);
        return df.format(irpf);
    }
    
    public Faixa identificarFaixa(){
        Faixa faixa;
         if (getSalario() <= 1903.98) {
             faixa = Faixa.PRIMEIRA;
}
         else if (getSalario() <= 2826.65) {
            faixa = Faixa.SEGUNDA; 
         }
         else if (getSalario() <= 3751.05) {
            faixa = Faixa.TERCEIRA; 
         }
         else if (getSalario() <= 4664.68) {
            faixa = Faixa.QUARTA; 
         }
         else {
            faixa = Faixa.QUINTA;
         }
        return faixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (this.salario <= 0){
        throw new IllegalArgumentException("Salário deve ser maior que Zero");
        } 
        this.salario = salario;
    }
}
