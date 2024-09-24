/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.Before;
import org.junit.Test;



public class ImovelTest {
   Imovel imovel;
   Bairro bairro;
   
   
   @Before
   public void InicializarContexto(){
        imovel = new Imovel();
        bairro = new Bairro();  

   }
   
    @Test(expected = IllegalArgumentException.class)
     public void testValidarAreaNegativa() {
         
      imovel.setArea(-5);
    }
    @Test(expected = IllegalArgumentException.class)
     public void testValidarCoeficienteSem() {
      bairro.setCoeficienteIptu(1.00);
      imovel.calcularIPTU();
    }

}