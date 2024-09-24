/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo;

/**
 *
 * @author sunse
 */
public class App {
    
    public static void main(String[] args){
        Pessoa marta;
        marta = new Pessoa();
        
        marta.altura = 1.50;
        marta.peso = 100;
        
        System.out.println("IMC " +marta.calcularImc());
    }
    
}
