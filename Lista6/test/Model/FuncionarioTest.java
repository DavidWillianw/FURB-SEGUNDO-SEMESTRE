/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sunse
 */
public class FuncionarioTest {
    

    public FuncionarioTest() {
    }
  /**
   @Before
   public void inicializarContexto(){
       func = new Funcionario("David",850); 
    }
 **/   
    @Test
    public void testValidarFaixaDeSalário1() {
      Funcionario func = new Funcionario("David",850);
      
        Faixa faixa = func.identificarFaixa();
        assertEquals(Faixa.PRIMEIRA,faixa);
    }
    @Test
    public void testVerificarSalario2(){
    Funcionario func = new Funcionario("David",850);
    
    String salario = func.calcularIRPF();
    
    assertEquals("0,00",salario);       
    }
        @Test
    public void testValidarFaixaDeSalário3() {
      Funcionario func = new Funcionario("David",1903.98);
      
        Faixa faixa = func.identificarFaixa();
        assertEquals(Faixa.PRIMEIRA,faixa);
    }
    @Test
    public void testVerificarSalario4(){
    Funcionario func = new Funcionario("David",1903.98);
    
    String salario = func.calcularIRPF();
    
    assertEquals("0,00",salario);       
    }
         @Test
    public void testValidarFaixaDeSalário5() {
      Funcionario func = new Funcionario("David",1903.99);
      
        Faixa faixa = func.identificarFaixa();
        assertEquals(Faixa.SEGUNDA,faixa);
    }
    @Test
    public void testVerificarSalario6(){
    Funcionario func = new Funcionario("David",1903.99);
    
    String salario = func.calcularIRPF();
    
    assertEquals("0,00",salario);       
    }
          @Test
    public void testValidarFaixaDeSalário7() {
      Funcionario func = new Funcionario("David",2000);
      
        Faixa faixa = func.identificarFaixa();
        assertEquals(Faixa.SEGUNDA,faixa);
    }
    @Test
    public void testVerificarSalario8(){
    Funcionario func = new Funcionario("David",2000);
    
    String salario = func.calcularIRPF();
    
    assertEquals("7,20",salario);       
    }
            @Test
    public void testValidarFaixaDeSalário9() {
      Funcionario func = new Funcionario("David",2826.65 );
      
        Faixa faixa = func.identificarFaixa();
        assertEquals(Faixa.SEGUNDA,faixa);
    }
    @Test
    public void testVerificarSalario10(){
    Funcionario func = new Funcionario("David",2826.65 );
    
    String salario = func.calcularIRPF();
    
    assertEquals("69,20",salario);       
    }
}
