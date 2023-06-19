/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura_basico;

/**
 *
 * @author Gerardo
 */
public class Factura_basico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gerardo", 1234, 99999999, "gerardo@test.com");
        CategoriaProducto cp1 = new CategoriaProducto("Frutas","23");
        Producto p1 = new Producto("Manzana", cp1, 7.50f);
        
        Factura f1 = new Factura(1, "2023/06/19", c1, p1);
        f1.imprimir();
    }
    
}
