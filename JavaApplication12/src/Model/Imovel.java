/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author sunse
 */


public class Imovel {

    private String Endereco;
    private int area;
    private Finalidade Finalidade;
    private Bairro bairro;

    public double calcularIPTU() {
        double resultado = 0;
        
        if(bairro==null){
        throw new IllegalArgumentException("O bairro está vázio");
        }
        else if(bairro.getCoeficienteIptu() < 0){
            throw new IllegalArgumentException("O coeficiente está negativo");
    }
     else if(getFinalidade() == null){
            throw new IllegalArgumentException("Não tem finalidade");
    }

      else  if(getArea()<=0){
    throw new IllegalArgumentException("A área deve ser informada");
    }
        this.area = area;
    }
        switch (Finalidade) {
            case Finalidade.COMERCIAL -> {
                if (getArea() < 1000) {
                    resultado = 500 * bairro.getCoeficienteIptu();
                    return resultado;
           break;
                }
            }
            case Finalidade.RESIDENCIAL -> {
                if (getArea() > 1000) {
                    resultado = (getArea() * 1.0) * bairro.getCoeficienteIptu();
                    return resultado;
           break;

                }
        }
            case Finalidade.INDUSTRIAL -> {
            if(getArea() <= 2000){
            resultado = 1000 * bairro.getCoeficienteIptu(); 
            return resultado;
            break;

            }
           else if(getArea() > 2000){
               resultado = (getArea()*0.55) * bairro.getCoeficienteIptu(); 
            return resultado;
            break;
        }
            }
        }
    return resultado;
   }
    
     
    public Finalidade getFinalidade(){
               
        return Finalidade;
    }
    
    public void setFinalidade(Finalidade Finalidade){
          
        this.Finalidade = Finalidade; 
    }
    
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area<0){
    throw new IllegalArgumentException("A área está negativa");
    }
        this.area = area;
    }

    public Bairro setBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

}
