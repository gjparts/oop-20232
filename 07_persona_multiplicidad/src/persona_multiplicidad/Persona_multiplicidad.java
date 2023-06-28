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
        
    }
    
}
