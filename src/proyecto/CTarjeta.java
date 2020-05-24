/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Juan carlos
 */
public class CTarjeta {
    private double limit_caja;
    private double limit_onLine;
    private int nro_cod;

    public CTarjeta(double limit_caja, double limit_onLine, int nro_cod) {
        this.limit_caja = limit_caja;
        this.limit_onLine = limit_onLine;
        this.nro_cod = nro_cod;
    }

    @Override
    public String toString() {
        return "La terjeta tiene el codigo= " + nro_cod;
    }
    
    public double getLimit_caja() {
        return limit_caja;
    }

    public void setLimit_caja(double limit_caja) {
        this.limit_caja = limit_caja;
    }

    public double getLimit_onLine() {
        return limit_onLine;
    }

    public void setLimit_onLine(double limit_onLine) {
        this.limit_onLine = limit_onLine;
    }

    public int getNro_cod() {
        return nro_cod;
    }

    public void setNro_cod(int nro_cod) {
        this.nro_cod = nro_cod;
    }

    
}
