/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao1;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author sunse
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.00");
        Funcionario funcionario = new Funcionario();

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        funcionario.setNome(nome);
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
        funcionario.setSalario(salario);

        double irpf = funcionario.calcularIRPF();
        JOptionPane.showMessageDialog(null, "Olá, " + funcionario.getNome());
        JOptionPane.showMessageDialog(null, "O salário bruto é de: " + funcionario.getSalario() + "\n"
                + "O imposto de renda a ser pago é do valor de " + df.format(funcionario.calcularIRPF()) + "\n"
                + "O seu salário final é: " + df.format((funcionario.getSalario() - irpf)));
        JOptionPane.showMessageDialog(null, "Até a próxima, " + funcionario.getNome());

    }

}
