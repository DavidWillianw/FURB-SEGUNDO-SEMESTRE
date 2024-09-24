/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;


public class Funcionario {
    private String nome;
    private double salario;

    public double calcularIRPF() {
        double irpf;

        if (salario <= 1903.98) {
            irpf = 0.0;
        } else if (salario <= 2826.65) {
            irpf = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            irpf = (2826.65 - 1903.98) * 0.075 + (salario - 2826.65) * 0.15;
        } else if (salario <= 4664.68) {
            irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salario - 3751.05) * 0.225;
        } else {
            irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275;
        }

        return irpf;
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
        this.salario = salario;
    }
}
