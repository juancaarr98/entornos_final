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

    public CCuenta(int lim_cuenta, double saldo, String fch) {
        this.lim_cuenta = lim_cuenta;
        this.saldo = saldo;
        this.fch = fch;
    }

    

    public CCuenta(int lim_cuenta,double saldo, String fch, ArrayList<CTarjeta> alTarjetas) {
        this.lim_cuenta = lim_cuenta;
        this.saldo = saldo;
        this.fch = fch;
        this.alTarjetas = alTarjetas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLim_cuenta() {
        return lim_cuenta;
    }

    public void setLim_cuenta(int lim_cuenta) {
        this.lim_cuenta = lim_cuenta;
    }

    public String getFch() {
        return fch;
    }

    public void setFch(String fch) {
        this.fch = fch;
    }

    public ArrayList<CTarjeta> getAlTarjetas() {
        return alTarjetas;
    }

    public void setAlTarjetas(ArrayList<CTarjeta> alTarjetas) {
        this.alTarjetas = alTarjetas;
    }
    public double mdSalarioMedio(){
        double resultado= Math.random()*2600+1500;
        return resultado;
    }
    
}
