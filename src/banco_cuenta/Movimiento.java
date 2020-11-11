/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_cuenta;

import java.util.Date;

/**
 *
 * @author 汴雪
 */
public class Movimiento {
    private int idMovimiento;
    private Date timeStamp;
    private String tipo;
    private double importe;
    
    
    public void setConcepto(String concepto) {
        this.tipo = concepto;
    }
    
    public String getConcepto() {
        return this.tipo;
    }
    
    public void setImporte(double x) {
        this.importe = x;
    }
    
    public double getImporte() {
        return this.importe;
    }
    
    
    
}



