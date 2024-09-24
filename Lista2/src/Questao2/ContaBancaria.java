package Questao2;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
void depositar(double valor) {
    if(valor < 0) {
        throw new IllegalArgumentException("Valor inválido");
    }
      this.saldo = saldo + valor; // Mesma coisa que fazer: Saldo += valor;
}

void sacar(double valor) {
    if(valor > 0 && valor > this.saldo) {
    }
 this.saldo = saldo - valor; // // Mesma coisa que fazer: Saldo -= valor;
 }

void transferir(ContaBancaria ContaDestino, double valor){
 if (valor > 0 && this.saldo >= valor){
     this.sacar(valor);
     ContaDestino.depositar(valor);
}
 else{  throw new IllegalArgumentException("Valor inválido");
             }
}

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
     public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    
}

