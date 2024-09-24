package Questao1;

public class App {
    
 public static void main(String[] args){
        Pessoa pessoa;
        pessoa = new Pessoa();
        
        pessoa.altura = 1.75;
        pessoa.peso = 78;
        
        System.out.println("IMC " +pessoa.calcularImc());
    }
    
}
