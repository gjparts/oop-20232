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
        
        Carro c1 = new Carro("Toyota", "Corolla", 2012, "Blanco");
        
        Producto pr1 = new Producto("ABC1", "Coca cola 3L");
        System.out.println("pr1, nombre: "+pr1.nombre);
        System.out.println("pr1, codigo: "+pr1.codigo);
        System.out.println("pr1, fabricante: "+pr1.fabricante);
        System.out.println("pr1, importado: "+pr1.importado);
        System.out.println("pr1, existencias: "+pr1.existencias);
        
        Ciudad ci1 = new Ciudad("Honduras","Cortés");
        System.out.println("ci1, pais: "+ci1.pais);
        System.out.println("ci1, depto: "+ci1.departamento);
        System.out.println("ci1, munic: "+ci1.municipio);
        System.out.println("ci1, alcalde: "+ci1.alcalde);
        
        Ciudad ci2 = new Ciudad("Honduras","Cortés","SPS","Alguien");
        System.out.println("ci2, pais: "+ci2.pais);
        System.out.println("ci2, depto: "+ci2.departamento);
        System.out.println("ci2, munic: "+ci2.municipio);
        System.out.println("ci2, alcalde: "+ci2.alcalde);
        
        //ejecutar el metodo imprimir de p3, p1 y p2
        p3.trabaja = true;
        p3.imprimir();
        p1.imprimir();
        p2.imprimir();
        
        Persona p6 = new Persona("Amy Casita de Vino", 'F', "Londres", 27);
        p6.trabaja = true;
        p6.imprimir();
        
        p6.saludar(false);
        p6.saludar(true);
        
        System.out.println(p3.nombre+" descuento "+p3.getDescuentoTerceraEdad()*100+"%");
        System.out.println(p6.nombre+" descuento "+p6.getDescuentoTerceraEdad()*100+"%");
    }
    
}
