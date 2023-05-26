/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_primerasemana;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola UNAH");
        System.out.print("Soy Gerardo");
        System.out.print("vivo en SPS");
        System.out.println(); //nueva linea
        System.out.println("Trabajo como programador\nduermo poco");
        
        //instanciar un objeto de clase Persona
        Persona p1 = new Persona();
        //new Persona() es el llamado al constructor de la clase
        p1.nombre = "Gerardo";
        p1.edad = 40;
        p1.genero = 'M';
        p1.ciudadNacimiento = "Ocotepeque";
        
        System.out.println(p1.nombre+" "+p1.edad);
        
    }
    
}
