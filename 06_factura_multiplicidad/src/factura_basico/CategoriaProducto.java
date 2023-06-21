/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura_basico;

/**
 * Define una categoria para productos
 * @author Gerardo Portillo
 * @since  2023/06/19
 */
public class CategoriaProducto {
    //atributos
    public String nombre;
    public String pasillo;
    //constructor
    /**
     * Crea un nuevo objeto de clase CategoriaProducto
     * @param nombre    nombre de la categoria de productos
     * @param pasillo   pasillo en donde se suele colocar
     *                  este tipo de productos
     */
    public CategoriaProducto(String nombre, String pasillo){
        this.nombre = nombre;
        this.pasillo = pasillo;        
    }
}
