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
    private Producto producto1;
    public Producto producto2;
    public Producto producto3;
    public Producto producto4;
    //constructor
    /**
     * Crea un objeto de clase Factura
     * @param numero    numero de la factura
     * @param fecha     fecha de emision de la factura
     * @param cliente   objeto de clase Cliente, si viene null entonces
     *                  se considera como Consumidor Final.
     * @param producto1 primer producto de la factura, es de clase Producto
     *                  y no se permite valores null.
     */
    public Factura(int numero, String fecha, Cliente cliente, Producto producto1){
        //producto1 es obligatorio
        if( producto1 == null )
            throw new IllegalArgumentException("producto1 debe ser un objeto.");
        else
            this.producto1 = producto1;
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        //los productos del 2 al 4 como no se envian por constructor
        //entonces los inicializamos en null
        this.producto2 = null;
        this.producto3 = null;
        this.producto4 = null;
    }
    //metodos
    public Producto getProducto1(){
        return this.producto1;
    }
    public Producto getProducto2(){
        return this.producto2;
    }
    public Producto getProducto3(){
        return this.producto3;
    }
    public Producto getProducto4(){
        return this.producto4;
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
        //producto1
        if( this.producto1 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto1.nombre);
            System.out.print("\t");
            System.out.println(this.producto1.precioVenta);
            subtotal += this.producto1.precioVenta; //sumar el producto1 al subtotal
        }
        //producto2
        if( this.producto2 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto2.nombre);
            System.out.print("\t");
            System.out.println(this.producto2.precioVenta);
            subtotal += this.producto2.precioVenta; //sumar el producto1 al subtotal
        }
        //producto3
        if( this.producto3 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto3.nombre);
            System.out.print("\t");
            System.out.println(this.producto3.precioVenta);
            subtotal += this.producto3.precioVenta; //sumar el producto1 al subtotal
        }
        //producto4
        if( this.producto4 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto4.nombre);
            System.out.print("\t");
            System.out.println(this.producto4.precioVenta);
            subtotal += this.producto4.precioVenta; //sumar el producto1 al subtotal
        }
        //sumario
        System.out.println("Sub-total: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15);
        System.out.println("Total: "+subtotal*1.15);
    }
}
