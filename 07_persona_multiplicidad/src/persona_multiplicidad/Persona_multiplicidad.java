/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_multiplicidad;

import java.util.LinkedList;

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
        
        //agregamos dos diplomas a la LinkedList
        //de la Persona p1
        Diploma di1 = new Diploma("INFOP", "Reparacion de Maquina de Coser");
        p1.diplomas.push(di1);
        p1.diplomas.push( new Diploma("CISCO","CCNA 1") );
        p1.diplomas.push(null);
        
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
        
        p3.diplomas = null; //hice null la coleccion de diplomas
                            //por lo tanto queda inutilizable
        p3.diplomas = new LinkedList(); //podriamos volver a inicializar
                                        //lo que no seria conveniente.
        p3.diplomas.push(di1);
        
        p3.imprimir();
        
        Persona p4 = new Persona("8765432", "Filomeno Colinas", 321654798);
        Mascota m543 = new Mascota("Terencio", "Loro");
        p4.mascotas = new Mascota[]{ m543 };    //crear un arreglo en el momento de uso
        
        p4.diplomas.push( new Diploma("New Horizons","Excel Avanzado") );
        p4.diplomas.push(di1);
        p4.diplomas.push(di1);
        //quiero eliminar un diploma en la posicion 0
        //los LinkedList se recorren desde el ultimo hacia el primero en JAVA
        p4.diplomas.remove(0);
        //borrar todos los diplomas (size regresa a cero)
        p4.diplomas.clear();
        
        //conyuge de persona 4
        Persona p5 = new Persona("11112222","Fulgencia Colinas",4444444);
        p4.conyuge = p5;
        
        //hijo de persona 4
        Persona p6 = new Persona("987654322","Pericles Colinas",12348765);
        p4.hijos.push(p6);
        //otro hijo para persona 4
        p4.hijos.push( new Persona("54329876","Donovan Colinas",0) );
        
        p4.imprimir();
    }
    
}
