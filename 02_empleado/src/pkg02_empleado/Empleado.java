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
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private char estadoCivil;
    private char contrato;
    private float salario;
    //constructor
    public Empleado(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.estadoCivil = 'S';
        this.contrato = 'P';
        this.salario = 0.00f;
    }
    //metodos
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        if( edad >= 0 )
            this.edad = edad;   //si la edad es numero positivo la aceptamos
        else
            throw new IllegalArgumentException("La edad debe ser numero positivo.");
    }
    
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'O' )
            this.genero = genero;   //si el genero es M F O lo aceptamos
        else
            throw new IllegalArgumentException("El genero solo puede ser M, F, O.");
    }
    
    
}
