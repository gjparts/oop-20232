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
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public int anio;
    public String color;
    //constructores
    /*cuando una clase solo tiene un constructor y este es
    con parametros; entonces cada vez que se quiera crear objetos
    de dicha clase se estará obligado a utilizar dicho constructor.*/
    public Carro(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }
}
