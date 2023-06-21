package factura_basico;

/**
 * Define una Factura
 * @author Gerardo Portillo
 * @since  2023/06/19
 */
public class Factura {
    //atributos
    public int numero;
    public String fecha;
    public Cliente cliente;
    private Producto[] productos;
    //constructor
    /**
     * Crea un objeto de clase Factura
     * @param numero    numero de la factura
     * @param fecha     fecha de emision de la factura
     * @param cliente   objeto de clase Cliente, si viene null entonces
     *                  se considera como Consumidor Final.
     * @param productos Array que contiene los productos de la factura.
     *                  No puede ser null y debe tener al menos un item
     *                  de clase Producto.
     */
    public Factura(int numero, String fecha, Cliente cliente, Producto[] productos){
        //el arreglo no puede ser null y debe tener al menos un item de clase Producto
        if( productos == null )
            throw new IllegalArgumentException("Debe enviar un arreglo de productos.");
        else{
            if( productos.length == 0 )
                throw new IllegalArgumentException("Debe haber al menos un producto.");
            else{
                if( productos[0] == null )  //si el primer elemento del arrelo es null...
                    throw new IllegalArgumentException("Primer producto debe ser un objeto");
                else
                    this.productos = productos;
            }
        }
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    //metodos
    public Producto[] getProductos(){
        return this.productos;
    }
    
    public void imprimir(){
        System.out.println("******* Factura *******");
        System.out.println("Numero: "+this.numero);
        System.out.println("Fecha: "+this.fecha);
        //si cliente es null es consumidor final, no lleva RTN.
        //de lo contrario lo imprimimos.
        System.out.print("Cliente: ");
        if( this.cliente == null )
            System.out.println("Consumidor Final");
        else{
            System.out.println(this.cliente.nombre);
            System.out.println("RTN: "+this.cliente.rtn);
        }
        //tabla de los productos
        System.out.println("Producto\tPrecio");
        //si alguno de los productos es null su valor es cero sin lo sumamos al subtotal.
        float subtotal = 0.00f;
        //arreglo de productos
        if( this.productos == null )
            System.out.println("No hay productos en la factura");
        else{
            for( int i = 0; i < productos.length; i++ ){
                if( productos[i] != null ){
                    System.out.print(this.productos[i].nombre);
                    System.out.print("\t");
                    System.out.println(this.productos[i].precioVenta);
                    subtotal += this.productos[i].precioVenta; //sumar el producto1 al subtotal
                }
            }
        }
        //sumario
        System.out.println("Sub-total: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15);
        System.out.println("Total: "+subtotal*1.15);
    }
}
