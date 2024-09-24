package Questao3;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Pessoa 1, Digite o peso: ");
        pessoa1.peso = scan.nextDouble();
        
        System.out.println("Pessoa 1, Digite a altura: ");
        pessoa1.altura = scan.nextDouble();
                     
        System.out.println("O IMC de Pessoa 1 é: " + pessoa1.calcularImc()+"\n");

        System.out.println("Pessoa 2, Digite o peso: ");
        pessoa2.peso = scan.nextDouble();
        
        System.out.println("Pessoa 2, Digite a altura: ");
        pessoa2.altura = scan.nextDouble();
                     
         System.out.println("O IMC de Pessoa 2 é: " + pessoa2.calcularImc()+"\n");

        System.out.println("Pessoa 3, Digite o peso: ");
        pessoa3.peso = scan.nextDouble();
        
        System.out.println("Pessoa 3, Digite a altura: ");
        pessoa3.altura = scan.nextDouble();
                     
         System.out.println("O IMC de Pessoa 3 é: " + pessoa3.calcularImc());
}
}