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
public class Persona {
    //atributos o propiedades
    public String nombre;
    public int edad;
    public char genero;
    public String ciudadNacimiento;
    //constructores de la clases
    public Persona(){
        //este es el constructor sin parametros
        this.nombre = "no definido";
        this.edad = 0;
        this.genero = 'N';
        this.ciudadNacimiento = "no definida";
    }
    public Persona(String nombre, int edad){
        //este es un constructor con dos parametros
        this.nombre = nombre;
        this.edad = edad;
        this.genero = 'N';
        this.ciudadNacimiento = "no definida";
    }
    public Persona(String nombre, char genero, String ciudadNacimiento, int edad){
        //este es un constructor con cuatro parametros
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.ciudadNacimiento = ciudadNacimiento;
    }
}
