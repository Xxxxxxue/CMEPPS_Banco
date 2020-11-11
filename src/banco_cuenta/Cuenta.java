/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_cuenta;

import java.util.ArrayList;

/**
 *
 * @author 汴雪
 */
public class Cuenta {
    private String mNumero;
    private String nTitular;
    private ArrayList<Movimiento> movimientos;
    
    public Cuenta(){
        
    }
    
    public Cuenta(String nc,String s){
        mNumero=nc;
        nTitular=s;
        movimientos=new ArrayList<Movimiento>();
    }
    
    public void Ingresar(double s){
        
       Movimiento m = new Movimiento();
       m.setImporte(s);
       this.movimientos.add(m); 
    }
    
    public void Retirar(double s) {
        
        Movimiento m = new Movimiento();
        m.setImporte(-s);
        this.movimientos.add(m);
    }
    
    public double getSaldo(){
        double saldo = 0;
        for(int i=0; i< movimientos.size(); i++) {
            saldo += movimientos.get(i).getImporte();
        }
        
        return saldo;
    }
}
