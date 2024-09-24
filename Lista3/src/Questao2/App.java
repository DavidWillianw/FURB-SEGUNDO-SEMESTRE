/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        Funcionario[] funcionario = new Funcionario[5];
        for (int i = 0; i <= 4; i++) {
            Funcionario umaPessoa = new Funcionario();

            JOptionPane.showMessageDialog(null, " ******* " + (i + 1) + " ª Funcionario *******");
            String nome = JOptionPane.showInputDialog("Informe seu nome");
            umaPessoa.setNome(nome);

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
            umaPessoa.setSalario(salario);

            funcionario[i] = umaPessoa;
        }
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.addColumn("Nome: ");
        tabela.addColumn("Salário Bruto: ");
        tabela.addColumn("Imposto: ");
        tabela.addColumn("Salário Líquido: ");

        
        for (int i = 0; i < funcionario.length; i++) {
            double irpf = funcionario[i].calcularIRPF();
            tabela.addRow(new Object[] {
                funcionario[i].getNome(),
                df.format(funcionario[i].getSalario()),
                df.format(irpf),
                df.format(funcionario[i].getSalario() - irpf)
            });
        }
        JTable tabelaFunc = new JTable(tabela);

        JScrollPane scrollPane = new JScrollPane(tabelaFunc);

        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
        }
    }

