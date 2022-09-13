
package calculadora;

import Modelo.Operaciones;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class OperacionesTest {
    private static final double DELTA = 1e-15;
    private final Operaciones operacion=new Operaciones();
    private double a, b, resultado;
    
    public OperacionesTest() {
    }
    
    @Test
    public void testsuma() {
         a= 1;
         b= 2;
        resultado = operacion.suma(a,b);
        assertEquals(3, resultado, DELTA);
    }
    @Test
    public void testResta() {
         a= 3;
         b= 2;
        resultado = operacion.resta(a,b);
        assertEquals(1, resultado, DELTA);
    }
    
    @Test
    public void testMultiplicacion() {
         a= 3;
         b= 2;
        resultado = operacion.multiplicacion(a,b);
        assertEquals(6, resultado, DELTA);
    }
    @Test
    public void testDivision() {
         a= 20;
         b= 10;
        resultado = operacion.division(a,b);
        assertEquals(10, resultado, DELTA);
    }
    @Test
    public void testPotencia() {
         a= 3;
         b= 2;
        resultado = operacion.potenciacion(a,b);
        assertEquals(9, resultado, DELTA);
    }
    @Test
    public void testRaiz() {
         a= 16;
        resultado = operacion.raiz(a);
        assertEquals(4, resultado, DELTA);
    }
}
