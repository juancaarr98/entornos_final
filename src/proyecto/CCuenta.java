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
public class CCuenta {
    private int lim_cuenta;
    private double saldo;
    private String fch;
    private ArrayList<CTarjeta> alTarjetas;

    /**
     *
     * @param lim_cuenta
     * @param saldo
     * @param fch
     */
    public CCuenta(int lim_cuenta, double saldo, String fch) {
        this.lim_cuenta = lim_cuenta;
        this.saldo = saldo;
        this.fch = fch;
    }

    /**
     *
     * @param lim_cuenta
     * @param saldo
     * @param fch
     * @param alTarjetas
     */
    public CCuenta(int lim_cuenta,double saldo, String fch, ArrayList<CTarjeta> alTarjetas) {
        this.lim_cuenta = lim_cuenta;
        this.saldo = saldo;
        this.fch = fch;
        this.alTarjetas = alTarjetas;
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    public int getLim_cuenta() {
        return lim_cuenta;
    }

    /**
     *
     * @param lim_cuenta
     */
    public void setLim_cuenta(int lim_cuenta) {
        this.lim_cuenta = lim_cuenta;
    }

    /**
     *
     * @return
     */
    public String getFch() {
        return fch;
    }

    /**
     *
     * @param fch
     */
    public void setFch(String fch) {
        this.fch = fch;
    }

    /**
     *
     * @return
     */
    public ArrayList<CTarjeta> getAlTarjetas() {
        return alTarjetas;
    }

    /**
     *
     * @param alTarjetas
     */
    public void setAlTarjetas(ArrayList<CTarjeta> alTarjetas) {
        this.alTarjetas = alTarjetas;
    }

    /**
     * Metodo para calcular el salario 
     * @return resultado = salario medio de un año
     */
    public double mdSalarioMedio(){
        double resultado= Math.random()*2600+1500;
        return resultado;
    }
    
}
