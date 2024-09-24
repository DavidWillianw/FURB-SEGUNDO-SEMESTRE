/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

public class Funcionario {
    private String nome;
    private double salario;

    public double calcularIRPF() {
        double irpf;

        if (getSalario() <= 1903.98) {
            irpf = 0.0;
        } else if (getSalario() <= 2826.65) {
            // Poderia também fazer 
            // diferenca = 1903.98 * (7.5/100); 
            irpf = (getSalario() - 1903.98) * 0.075;
        } else if (getSalario() <= 3751.05) {
            irpf = (2826.65 - 1903.98) * 0.075 + (getSalario() - 2826.65) * 0.15;
        } else if (getSalario() <= 4664.68) {
            irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (getSalario() - 3751.05) * 0.225;
        } else {
            irpf = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (getSalario() - 4664.68) * 0.275;
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
