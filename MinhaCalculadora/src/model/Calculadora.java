/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author sunse
 */
public class Calculadora {
    
    public int somar (int num1, int num2){
     return num1 + num2;   
    }
   
  public int subtrair (int num1, int num2){
     return num1 - num2;   
    }    
  
  public int multiplicar (int num1, int num2){
      
    
     return num1 * num2;   
    }  
  public int dividir (int num1, int num2){
        if (num2<=0){
         throw new IllegalArgumentException(" Divisão por Zero ");
      }
     return num1/num2;   
    }  
}
