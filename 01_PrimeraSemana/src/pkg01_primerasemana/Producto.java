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
public class Producto {
    //atributos
    public String codigo;
    public String nombre;
    public String fabricante;
    public int existencias;
    public boolean importado;
    //constructores
    public Producto(){
        this.codigo = "no tiene";
        this.nombre = "no tiene";
        this.fabricante = "no definido";
        this.existencias = 0;
        this.importado = false;
    }
    public Producto( String codigo, String nombre ){
        this(); //ejecutar el constructor sin parametros
                //para evitar escribir dos veces la inicializacion
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public Producto(String codigo, String nombre,
                    String fabricante, boolean importado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.existencias = 0;
        this.importado = importado;
    }
}
