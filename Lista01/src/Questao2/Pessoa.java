package Questao2;

public class Pessoa {
    double peso;
    double altura;
    
    double calcularImc(){
    return peso / Math.pow(altura,2);
}
}