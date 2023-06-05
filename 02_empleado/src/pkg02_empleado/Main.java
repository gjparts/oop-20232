/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_empleado;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Gerardo",40,'M');
        e1.SetEstadoCivil('C');
        e1.setContrato('P');
        e1.imprimir();
        Empleado e2 = new Empleado("Irene",40,'F');
        e2.setEdad(39);
        e2.SetEstadoCivil('C');
        e2.setContrato('P');
        e2.setSalario(20000.00f);
        e2.imprimir();
        
    }
    
}
