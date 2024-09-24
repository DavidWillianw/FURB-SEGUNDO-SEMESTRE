/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author rwsouza
 */
public class ImovelTest {
    Imovel imovel;
    Bairro bairro;
    
    @Before
    public void inicializarContexto(){
        imovel = new Imovel();
        bairro= new Bairro();
    }
     /**
      * Certificar-se que seja recusada área negativa
      */
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarAreaNegativa() {
        //Entrada: Criar um imóvel e definir que a área é -5 m2
        //Saída: Exceção IllegalArgumentException lançada        
        imovel.setArea(-5);      
               
    }
    
    /**
     * Certificar-se que seja recusado calcular o IPTU de imóvel sem 
     * que seja especificada a área
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarCalcularIptuSemAreaEspecificada(){
        /*Entrada: Criar um imóvel residencial no bairro
          Centro, cujo coeficiente é 1. Sem
          especificar a área, solicitar o cálculo
          do IPTU. 
        */
        
        bairro.setNome("Centro");
        bairro.setCoeficenteIptu(1);
        
        imovel.setBairro(bairro);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.calcularIptu();
    }
    
}
