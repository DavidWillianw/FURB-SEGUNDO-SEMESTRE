
package Questao2;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.print("Digite o peso: ");
        pessoa.peso = scan.nextDouble();
        
        System.out.print("Digite a altura: ");
        pessoa.altura = scan.nextDouble();
        
        System.out.print("O seu IMC é: " + pessoa.calcularImc());
        
    }
}
