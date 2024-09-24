/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Digite o numero da 1 conta: ");
        conta1.setNumero(scan.nextLine());
        
        System.out.println("");

        System.out.println("Digite o titular da 1 conta:");
        conta1.setTitular(scan.nextLine());
        
        System.out.println("");

        System.out.println("Digite o numero da 2 conta:");
        conta2.setNumero(scan.nextLine());
        
        System.out.println("");
       
        System.out.println("Digite o titular da 2 conta:");
        conta2.setTitular(scan.nextLine());
        
        System.out.println("");

// Realize depósitos na primeira conta nos valores de R$ 1.000,00 e R$ 700,00.
        conta1.depositar(1000);
        conta1.depositar(700);
        
// Realize depósitos na segunda conta nos valores de R$ 5.000,00.   
        conta2.depositar(5000);  
        
// Faça um saque na 2ª conta no valor de R$ 3.000,00.
        conta2.sacar(3000);
        
// Transfira R$ 1.800,00 da 2ª conta para a 1ª conta
        conta2.transferir(conta1, 1800);

        System.out.println("Titular: (" + conta1.getTitular() + ")  R$ " + conta1.getSaldo());
        System.out.println("Titular: (" + conta2.getTitular() + ")  R$ " + conta2.getSaldo());

        scan.close();
    }
}
