/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Juan carlos
 */
public class CGestor {
   
    public CGestor() {}
    
    public void mvCrearTarjeta(CCuenta cu,int limt_cajero,int  limt_on,int codigo){
        CTarjeta t= new CTarjeta(limt_cajero,limt_on,codigo);
        cu.getAlTarjetas().add(t);
    }
    public void mvCrearCuenta(CCliente a,int limite, double dinero,String fecha_alta){
        CCuenta c=new CCuenta(limite,dinero,fecha_alta);
        a.getAlCuentas().add(c);
        System.out.println("Esta cuenta, todavia no tiene tarjetas");
    }
    public CCliente mvCrearPerfil(String nom,String apell,String d,String dni,int age,int tlf){
        CCliente p=new CCliente(nom,apell,d,dni,age,tlf);
        System.out.println("Este perfil no tiene cuentas asociadas.");
        return p;
    }
    public void mvModificarDatos(CCliente a,String nom,String apell,String d,String dni,int tlf,int age){
        a.setNombre(nom);
        a.setAplellido(apell);
        a.setDir(d);
        a.setNif(dni);
        a.setTf(tlf);
        a.setEdad(age);
    }
    public String mvConsultar(CCliente a){
       return a.toString(); 
    }
}
