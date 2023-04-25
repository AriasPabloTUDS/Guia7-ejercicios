/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.extra.pkg4;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class GUIA7EXTRA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
        Luego, crea un método "retirar_dinero" que permita retirar una 
        de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca 
        sea negativo después de realizar una transacción de retiro.
        */
        
        Scanner leer = new Scanner(System.in);
        
        Cuenta cuenta1 = new Cuenta(123000.45,"Pablo");
        
        System.out.println("El saldo de la cuenta: "+cuenta1.getTitular()+" $:"+cuenta1.getSaldo());
        cuenta1.extraerDinero(55800);
        System.out.println("El saldo de la cuenta: "+cuenta1.getTitular()+" $:"+cuenta1.getSaldo());
        cuenta1.extraerDinero(69000);
        System.out.println("El saldo de la cuenta: "+cuenta1.getTitular()+" $:"+cuenta1.getSaldo());
        
    }
    
}
