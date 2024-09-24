/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author sunse
 */
public class Pessoa {
    double peso;
    double altura;
    
    double calcularImc(){
    return peso / Math.pow(altura,2);
}
}
