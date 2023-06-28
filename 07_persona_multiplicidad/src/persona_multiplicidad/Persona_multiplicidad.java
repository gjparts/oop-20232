/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_multiplicidad;

/**
 *
 * @author Gerardo
 */
public class Persona_multiplicidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Barrios
        Barrio elcarmen = new Barrio("El Carmen", "Este", "21101");
        Barrio jardines = new Barrio("Jardines del Valle", "Oeste", "1234");
        Barrio fesitranh = new Barrio("FESITRANH", "Norte", "4321");
        
        //Direcciones
        Direccion d1 = new Direccion(jardines);
        d1.avenida = "a la universidad";
        d1.calle = "bulevard UNAH-VS";
        Direccion d2 = new Direccion(fesitranh);
        d2.calle = "Calle a Puerto Cortés";
        Direccion d3 = new Direccion(elcarmen);
        d3.calle = "Carretera a el Ocotillo";
        d3.casa = "46";
        
        //Empresas
        Empresa pricesmart = new Empresa("PriceSmart", d1, 7777777);
        Empresa estelinas = new Empresa("Estelina's", d2, 1111111);
        
        //Personas
        Persona p1 = new Persona("1234567890", "Fenestacio Ruiz", 12341234);
        p1.empresaLabora = pricesmart;
        p1.direccion = d3;
        p1.imprimir();
        
        Persona p2 = new Persona("11111111","Estevancito Maravilla",12341234);
        p2.direccion = new Direccion(fesitranh);
        p2.direccion.calle = "Principal";
        p2.direccion.bloque = "X";
        p2.empresaLabora = new Empresa("LACTOHSA", new Direccion(jardines), 55555555);
        p2.empresaLabora.getDireccion().avenida = "Avenida a Migracion";
        p2.empresaLabora.getDireccion().calle = "Calle a Jardines del Valle";
        
        //arreglo de mascotas
        Mascota firulais = new Mascota("Firulais", "Perro");
        Mascota chispita = new Mascota("Chispita", "Gato");
        Mascota[] arr1 = {firulais, chispita};
        p2.mascotas = arr1;

        p2.imprimir();
        
        Persona p3 = new Persona("8888888888", "Curco Bain", 98765432);
        Mascota m123 = new Mascota("Nepomusemo", "Pez");
        Mascota[] arr2 = { new Mascota("Doris", "Pez"), m123 };
        p3.mascotas = arr2;
        p3.mascotas[0].especie = "Pez Exotico"; //se puede cambiar objetos en array
        p3.imprimir();
        
        Persona p4 = new Persona("8765432", "Filomeno Colinas", 321654798);
        Mascota m543 = new Mascota("Terencio", "Loro");
        p4.mascotas = new Mascota[]{ m543 };    //crear un arreglo en el momento de uso
        p4.imprimir();
    }
    
}
