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
        
        Persona p2 = new Persona();
        System.out.println(p2.nombre+" "+p2.edad);
        
        Persona p3 = new Persona("Filomeno Colinas", 70);
        System.out.println(p3.nombre+" "+p3.edad+" "+p3.ciudadNacimiento);
        
        Persona p4 = new Persona("Estevancito Maravilla", 'M', "en algun lado", 80);
        System.out.println(p4.nombre+" "+p4.edad+" "+p4.ciudadNacimiento);
        
        Persona p5 = new Persona();
        System.out.println("La direccion de memoria de p5 es "+p5);
        System.out.println("La direccion de memoria de p4 es "+p4);
    }
    
}
