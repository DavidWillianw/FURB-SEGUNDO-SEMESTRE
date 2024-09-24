package Model;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sunse
 */
public class EstadiaTest {
    
    public EstadiaTest() {
    }
   
    public void testValidarValorPagar(){
    Estadia func = new Estadia(20,2);
    
    double ler = func.calcularValorPagar();         
    assertEquals(20,00,ler); 
    }
 public void testValidarValorPagar2(){
    Estadia func = new Estadia(13,17);
    
    double ler = func.calcularValorPagar();         
    assertEquals(16,00,ler); 
    }
      @Test
    public void testValidarTempoEstadia() {
      Estadia func = new Estadia(20,2);
      
        int ler  = func.CalcularTempoEstadia();
        assertEquals(6,ler);
    }
    
}
