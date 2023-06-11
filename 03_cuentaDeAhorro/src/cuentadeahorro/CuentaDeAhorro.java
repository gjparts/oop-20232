/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentadeahorro;

/**
 *
 * @author Gerardo
 */
public class CuentaDeAhorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaAhorro c1 = new CuentaAhorro("Gerardo", "14141");
        System.out.println("saldo: "+c1.getSaldo());
        //c1.retirar(1);
        c1.depositar(900);
        System.out.println("saldo: "+c1.getSaldo());
        //c1.depositar(-500);
        c1.depositar(5000);
        System.out.println("saldo: "+c1.getSaldo());
        c1.retirar(0);
        System.out.println("saldo: "+c1.getSaldo());
        c1.retirar(1000);
        System.out.println("saldo: "+c1.getSaldo());
        //c1.retirar(8000);
        //c1.retirar(-100);
        c1.retirar(1000.56f);
        System.out.println("saldo: "+c1.getSaldo());
    }
    
}
