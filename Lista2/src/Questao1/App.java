/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

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
            umaPessoa.setNome(sc.nextLine());
            
            System.out.println("Informe a Altura: ");
            umaPessoa.setAltura(sc.nextDouble());

            System.out.println("Informe o Peso: ");
            umaPessoa.setPeso(sc.nextDouble());
            sc.nextLine();
            
            vetPessoa[i] = umaPessoa;            
        }
        for(int i = vetPessoa.length-1; i >= 0; i--){
          System.out.println((i+1)+" ª Pessoa => "+
                             " Nome: "+vetPessoa[i].getNome()+
                             " Altura: "+vetPessoa[i].getAltura()+
                             " Peso: "+vetPessoa[i].getPeso()+
                             "IMC: "+df.format(vetPessoa[i].calcularImc(vetPessoa[i].getPeso(), vetPessoa[i].getAltura())));  
        }      
    }
}
