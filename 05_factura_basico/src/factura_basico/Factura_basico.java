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
        Cliente c2 = new Cliente("Josue",4321,12341234,"j@j.com");
        Cliente c3 = new Cliente("Viena",7777,77777777,"viena@califik.com");
        
        CategoriaProducto cp1 = new CategoriaProducto("Frutas","23");
        CategoriaProducto cp2 = new CategoriaProducto("Carnes","12");
        CategoriaProducto cp3 = new CategoriaProducto("Bebidas","16");
                
        Producto p1 = new Producto("Manzana Roja", cp1, 7.50f);
        Producto p2 = new Producto("Jamon 1/2Lb", cp2, 45.00f);
        Producto p3 = new Producto("Coca Cola 3L", cp3, 65.00f);
        
        Factura f1 = new Factura(1, "2023/06/19", c1, p1);
        f1.imprimir();
        
        Factura f2 = new Factura(2,"2023/06/20",c3,p2);
        f2.producto2 = p3;
        f2.producto3 = p2;
        f2.imprimir();
        
        Factura f3 = new Factura(3,"2023/06/20",c2,p1);
        f3.producto3 = p1;
        f3.producto4 = p1;
        f3.imprimir();
        
        Factura f4 = new Factura(4,"2023/06/20",c3,p3);
        f4.producto4 = p3;
        f4.producto2 = p1;
        f4.producto3 = p2;  f4.imprimir();
    }
    
}
