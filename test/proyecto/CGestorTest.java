/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import proyecto.CGestor;
import proyecto.CCliente;
import proyecto.CCuenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Juan carlos
 */
public class CGestorTest {
    static ArrayList<CTarjeta> alTar= new ArrayList<>();
    static ArrayList<CCuenta> alCuen= new ArrayList<>();

    /**
     *
     */
    @Test
    public void testMvCrearTarjeta() {
        CCuenta c1 =new CCuenta(100,2000.0,"20/10/1999",alTar);
        CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        CGestor g1=new CGestor();
        g1.mvCrearTarjeta(c1, 500, 300, 5614);
        assertEquals(5614,c1.getAlTarjetas().get(0).getNro_cod());
    }

    /**
     * Test of mvCrearCuenta method, of class CGestor.
     */
    @Test
    public void testMvCrearCuenta() {
      CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
      CGestor g1=new CGestor();
      g1.mvCrearCuenta(pepe, 100, 2000.0, "10/12/2000");
       assertTrue(pepe.getAlCuentas().get(0).getSaldo()==2000.0);
    }

    /**
     *
     */
    @Test
    public void testMvCrearPerfil() {
        CGestor g1=new CGestor();
        g1.mvCrearPerfil("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134);
         CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        assertEquals(pepe.toString(),"Para el cliente: " + "nombre=" + "Pepe" + ", aplellido=" + "Hernandez" + ", dir=" + "Calle las rosas" + ", nif=" + "56493549G" + ", edad=" + 20 + ", tf=" + 965846134 + ", alCuentas=" + alCuen + '}');
    }

    /**
     *
     */
    @Test
    public void testMvModificarDatos() {
        CGestor g1=new CGestor();
        CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
        g1.mvModificarDatos(pepe, "Antonio", "Muñoz", "La Luz", "52145948W", 630495781, 25);
        assertEquals(pepe.getNombre(),"Antonio");
        assertEquals(pepe.getAplellido(),"Muñoz");
        assertEquals(pepe.getAplellido(),"La Luz");
        assertEquals(pepe.getNif(),"52145948W");
        assertTrue(pepe.getTf()==630495781);
        assertTrue(pepe.getEdad()==25);
    }

    /**
     *
     */
    @Test
    public void testMvConsultar() {
       CGestor g1=new CGestor();
       CCliente pepe = new CCliente("Pepe","Hernandez","Calle las rosas","56493549G",20,965846134,alCuen);
       assertEquals(pepe.toString(),g1.mvConsultar(pepe));
    }
    
}
