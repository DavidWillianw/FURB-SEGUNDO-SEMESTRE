/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        Pessoa[] vetPessoa = new Pessoa[3];        
        for (int i = 0; i <= 2;i++){
            Pessoa umaPessoa = new Pessoa();
            System.out.println(" ******* "+(i+1)+" ª Pessoa *******");
            System.out.println("Informe o nome: ");
            umaPessoa.nome = sc.nextLine();
            
            System.out.println("Informe a Altura: ");
            umaPessoa.altura = sc.nextDouble();

            System.out.println("Informe o Peso: ");
            umaPessoa.peso = sc.nextDouble();
            sc.nextLine();
            
            vetPessoa[i] = umaPessoa;            
        }
        //Listagem Pessoas
        for(int i = vetPessoa.length-1; i >= 0; i--){
          System.out.println((i+1)+" ª Pessoa => "+
                             " Nome: "+vetPessoa[i].nome+
                             " Altura: "+vetPessoa[i].altura+
                             " Peso: "+vetPessoa[i].peso+
                             "IMC: "+df.format(vetPessoa[i].calcularImc()));  
        }      
    }
}
