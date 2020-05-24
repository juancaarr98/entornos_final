/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
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
public class CClienteTest {
    static ArrayList<CTarjeta> alTar= new ArrayList<>();
    static ArrayList<CCuenta> alCuen= new ArrayList<>();


    @Test
    public void testMvInsertar() {
        CTarjeta t1=new CTarjeta(300.0,100.0,259);
        alTar.add(t1);
        CCuenta c1 =new CCuenta(100,2000.0,"20/10/1999",alTar);
        alCuen.add(c1);
        CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        assertTrue(pepe.mvInsertar(pepe,0, 500)==2500.0);
        assertFalse(pepe.mvInsertar(pepe, 0,600.0)==2000.0);
    }

    /**
     * Test of mcSacar method, of class CCliente.
     */
    @Test
    public void testMdSacar() {
        CTarjeta t1=new CTarjeta(300.0,200.0,259);
        alTar.add(t1);
        CCuenta c1 =new CCuenta(100,200.0,"20/10/1999",alTar);
        alCuen.add(c1);
        CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        assertTrue(pepe.mdSacar(pepe, 0, 50.0, 0,'c')==150.0);
        assertTrue(pepe.mdSacar(pepe, 0,150.0,0,'c')==0.0);
        assertTrue(pepe.mdSacar(pepe, 0,50.0,0,'o')==150.0);
        assertTrue(pepe.mdSacar(pepe, 0,150.0,0,'o')==0.0);
        assertTrue(pepe.mdSacar(pepe, 0,150.0,0,'r')==0.0);
    }

    @Test
    public void testToString(){
        CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        assertEquals("Para el cliente: " + "nombre=" + pepe.getNombre() + ", aplellido=" + pepe.getAplellido() + ", dir=" + pepe.getDir() + ", nif=" + pepe.getNif() + ", edad=" + pepe.getEdad() + ", tf=" + pepe.getTf() + ", alCuentas=" + pepe.getAlCuentas(),pepe.toString());
    }
    
}
