/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura_basico;

/**
 * Representa a un cliente de la organizacion
 * @author Gerardo Portillo
 * @since  2023/06/16
 */
public class Cliente {
    //atributos
    public String nombre;
    public int rtn;
    public int telefono;
    public String correo;
    //constructor
    /**
     * Crea un nuevo objeto de clase Cliente
     * @param nombre    nombre completo del cliente
     * @param rtn       registro tributario nacional del cliente
     * @param telefono  numero de telefono del cliente
     * @param correo    correo electronico del cliente
     */
    public Cliente(String nombre, int rtn, int telefono, String correo){
        this.nombre = nombre;
        this.rtn = rtn;
        this.telefono = telefono;
        this.correo = correo;
    }
}
