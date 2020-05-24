/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author Juan carlos
 */
public class CCliente {
    private String nombre;
    private String aplellido;
    private String dir;
    private String nif;
    private int edad;
    private int tf;
    private ArrayList<CCuenta> alCuentas;

    /**
     *
     * @param nombre
     * @param aplellido
     * @param dir
     * @param nif
     * @param edad
     * @param tf
     */
    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
    }

    /**
     *
     * @param nombre
     * @param aplellido
     * @param dir
     * @param nif
     * @param edad
     * @param tf
     * @param alCuentas
     */
    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf, ArrayList<CCuenta> alCuentas) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
        this.alCuentas = alCuentas;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getAplellido() {
        return aplellido;
    }

    /**
     *
     * @param aplellido
     */
    public void setAplellido(String aplellido) {
        this.aplellido = aplellido;
    }

    /**
     *
     * @return
     */
    public String getDir() {
        return dir;
    }

    /**
     *
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     *
     * @return
     */
    public String getNif() {
        return nif;
    }

    /**
     *
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public int getTf() {
        return tf;
    }

    /**
     *
     * @param tf
     */
    public void setTf(int tf) {
        this.tf = tf;
    }

    /**
     *
     * @return
     */
    public ArrayList<CCuenta> getAlCuentas() {
        return alCuentas;
    }

    /**
     *
     * @param alCuentas
     */
    public void setAlCuentas(ArrayList<CCuenta> alCuentas) {
        this.alCuentas = alCuentas;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Para el cliente: " + "nombre=" + nombre + ", aplellido=" + aplellido + ", dir=" + dir + ", nif=" + nif + ", edad=" + edad + ", tf=" + tf + ", alCuentas=" + alCuentas + '}';
    }
    
    /**
     *
     * @param c
     * @param nro_cuent
     * @param cantidad
     * @return el saldo final de la cuenta con el incremento.
     */
    public double mvInsertar(CCliente c, int nro_cuent,double cantidad){
        double saldo_final=c.getAlCuentas().get(nro_cuent).getSaldo() +cantidad;
        c.getAlCuentas().get(nro_cuent).setSaldo(saldo_final); 
        return saldo_final;
    }
    

    /**
     *
     * @param c
     * @param nro_cuent
     * @param cantidad
     * @param nro_tarjeta
     * @param x
     * @return 0.0 en caso de que haya algun error y el slado final de la cuenta en caso de que todo se haya completado con exito.
     */
    public double  mdSacar(CCliente c, int nro_cuent,double cantidad, int nro_tarjeta,char x){
        double saldo_cuenta=c.getAlCuentas().get(nro_cuent).getSaldo();
        double lim_cuenta=c.getAlCuentas().get(nro_cuent).getLim_cuenta();
        double lim_cajero=c.getAlCuentas().get(nro_cuent).getAlTarjetas().get(nro_tarjeta).getLimit_caja();
        double lim_online=c.getAlCuentas().get(nro_cuent).getAlTarjetas().get(nro_tarjeta).getLimit_onLine();
        double resultado=0.0;
        switch(x){
            case 'c':
                if((cantidad<lim_cajero)){
                    resultado=saldo_cuenta-cantidad;
                    if(resultado>lim_cuenta)
                        return resultado;
                    else 
                        return 0.0;
                }
                break;
            case 'o':
                if((cantidad<lim_online)){
                    resultado=saldo_cuenta-cantidad;
                    if(resultado>lim_cuenta)
                        return resultado;
                    else 
                        return 0.0;
                }
                break;           
        }//end switch
        return resultado;
    }
    
}
