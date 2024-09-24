package Questao1;


public class Pessoa {

    private double peso;
    private double altura;
    private String nome;
    
    public double calcularImc(double peso, double altura){
        return peso / Math.pow(altura,2);
    }
   
    public String getNome(){
        return nome;
    }
     public void setNome(String nome){
        this.nome = nome;
    }   
    public double getAltura(){
        return altura;
    }
     public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
      public void setPeso(double peso){
        this.peso = peso;
    }
}