/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sunse
 */
public class ArgumentoNaoEhArquivoException extends Exception{
    
    
        public ArgumentoNaoEhArquivoException(String arquivo){
        super("O arquivo " + arquivo + " não é MP3");
    }
}
