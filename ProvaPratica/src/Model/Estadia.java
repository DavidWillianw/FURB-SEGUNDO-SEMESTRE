/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author sunse
 */
    public class Estadia {

     private int horaEntrada;
     private int horaSaida;

  
    public Estadia() {
        this.horaEntrada = 0;
        this.horaSaida = 0;
            }
/* 
     Ele valida se hora entrada estão em valores aceitaveis para serem registrados.
 */
    public Estadia(int horaEntrada, int horaSaida) {
        if(horaEntrada > 24 && horaEntrada < 0){
         throw new IllegalArgumentException("“Valor incorreto para hora: " + horaEntrada);
        }
        else if(horaSaida > 24 && horaSaida < 0){
         throw new IllegalArgumentException("“Valor incorreto para hora: " + horaSaida);
    }
       
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        
    }

    
    /* 
     Ele calcula o tempo de estadia da pessoa, ele tem uma condição onde 
    verifica se hora saida é maior que hora entrada, se não, ele vai diminuir 
    a hora de entrada por 24 e soma com a hora de saida.
 */
    public int CalcularTempoEstadia(){
   if (horaSaida >= horaEntrada) {
            return horaSaida - horaEntrada;
        } else {
            return (24 - horaEntrada) + horaSaida;
        }
    }
       /* 
     Ele calcula o valor a Pagar, ele utiliza o CalcularTempoEstadia() na
    condição if para saber se a pessoa ficou no máximo 3 horas, se ele ficou 
    mais pagará 14 + 2 reais.
 */
   public double calcularValorPagar(){
       double ValorPagar = 0;
       
    if(CalcularTempoEstadia() <= 3){
       ValorPagar = 14;
    }
    else if(CalcularTempoEstadia() > 3){
        ValorPagar = 14 + (CalcularTempoEstadia()*2.00);
    }
         return ValorPagar;
    
    }     
      public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEstrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
}
