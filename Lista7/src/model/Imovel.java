/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rwsouza
 */
public class Imovel {
    private String endereco;
    private int area;
    private Finalidade finalidade; 
    private Bairro bairro;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        //Recusar tentativa de definir um imóvel com área negativa
        if (area < 0){
            throw new IllegalArgumentException("Área não pode ser negativa");
        }
        this.area = area;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    public double calcularIptu(){
        
        if (getBairro() == null){
          //Recusar tentativa de calcular IPTU para imóveis em que não foi definido o bairro 
          throw new IllegalArgumentException("Bairro não definido.");
        }
        
        if (getBairro().getCoeficenteIptu() < 0){
            //Recusar tentativa de calcular IPTU para imóveis em bairro em que o coeficiente seja negativo
            throw new IllegalArgumentException("Coeficiente Iptu não pode ser negativo.");
        }
        
        if (getFinalidade() == null){
            //Recusar tentativa de calcular IPTU para imóveis em que não foi definida a sua finalidade 
            throw new IllegalArgumentException("Finalidade não definida.");
        }
        //Decorrente do caso de teste 2 do plano de testes
        if (getArea() <= 0){
            throw new IllegalArgumentException("Area deve ser informada.");
        }
        
        
        double valorImposto = 0;
        
        switch(getFinalidade()){
            case RESIDENCIAL :
                    valorImposto = getArea() * 1.0;
                  break;
            case COMERCIAL : 
                 
                  if(getArea() <= 100){
                     //Imóveis com até 100 m2, cobra-se R$ 500,00;  
                     valorImposto = 500;  
                  }else if (getArea() <= 400){
                      //Imóveis acima de 100 m2 e até 400 m2, cobra-se R$ 1.000,00;
                      valorImposto = 1000;
                  }else{
                      //Imóveis acima de 400 m2 cobra-se R$ 2,55 para cada m2
                      valorImposto = getArea() * 2.55;
                  }
                 break;
            case INDUSTRIAL:
                 if (getArea() <= 2000){
                     //Imóveis com até 2.000 m2 cobra-se R$ 1.000,00; 
                     valorImposto = 1000;                     
                 }else{
                     //Acima de 2.000 m2, cobra-se R$ R$ 0,55 por m2
                    valorImposto = getArea() * 0.55;
                 } 
                break;
        }
        
        //coeficiente multiplicativo por bairro
        valorImposto = valorImposto * getBairro().getCoeficenteIptu();
                
        return valorImposto;
        
    }
    
    
    
    
}
