/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_cuenta;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 汴雪
 */
public class CuentaTest extends TestCase {
    
    Cuenta c;
    
    public CuentaTest() {
    }
    
    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
        c = new Cuenta("0001.0002.12.1234567890","Fulano de Tal");
    }
    
    @AfterClass
    public void tearDownClass() {
    }
    
    @Test
    public void testIngresar_double() throws Exception {
        System.out.println("Ingresar test");
        try {
            c.Ingresar(1000.0);
            assertTrue(c.getSaldo()==1000.0);
        }
        catch (Exception e){
            fail("No deberia haber fallado.");
        }
        
    }
    
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar test");
        System.out.println(c.getSaldo());
        assertEquals(c.getSaldo(), 0.0);
        c.Ingresar(2000.0);
        try {
            c.Retirar(1000.0);
            assertTrue(c.getSaldo()==1000.0);
        }
        catch (Exception e){
            fail("No deberia haber fallado.");
        }
        
    }
}
