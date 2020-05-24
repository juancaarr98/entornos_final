/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import proyecto.CTarjeta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan carlos
 */
public class CTarjetaTest {
    
    /**
     *
     */
    public CTarjetaTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getLimit_caja method, of class CTarjeta.
     */
    @Test
    public void testGetLimit_caja() {
        System.out.println("getLimit_caja");
        CTarjeta instance = null;
        double expResult = 0.0;
        double result = instance.getLimit_caja();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimit_caja method, of class CTarjeta.
     */
    @Test
    public void testSetLimit_caja() {
        System.out.println("setLimit_caja");
        double limit_caja = 0.0;
        CTarjeta instance = null;
        instance.setLimit_caja(limit_caja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimit_onLine method, of class CTarjeta.
     */
    @Test
    public void testGetLimit_onLine() {
        System.out.println("getLimit_onLine");
        CTarjeta instance = null;
        double expResult = 0.0;
        double result = instance.getLimit_onLine();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimit_onLine method, of class CTarjeta.
     */
    @Test
    public void testSetLimit_onLine() {
        System.out.println("setLimit_onLine");
        double limit_onLine = 0.0;
        CTarjeta instance = null;
        instance.setLimit_onLine(limit_onLine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNro_cod method, of class CTarjeta.
     */
    @Test
    public void testGetNro_cod() {
        System.out.println("getNro_cod");
        CTarjeta instance = null;
        int expResult = 0;
        int result = instance.getNro_cod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNro_cod method, of class CTarjeta.
     */
    @Test
    public void testSetNro_cod() {
        System.out.println("setNro_cod");
        int nro_cod = 0;
        CTarjeta instance = null;
        instance.setNro_cod(nro_cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
