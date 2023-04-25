/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.extra.pkg4;

/**
 *
 * @author Pablo
 */
public class Cuenta {
    private double saldo;
    private String titular;
    
    public Cuenta(){
        
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void extraerDinero(double importe) {
        if (saldo > 0) {
            if (importe <= saldo) {
                saldo = saldo - importe;
            } else System.out.println("Saldo insuficiente");
        } else  System.out.println("Saldo insuficiente");
        
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
    
}
