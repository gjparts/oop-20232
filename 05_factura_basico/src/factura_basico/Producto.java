package factura_basico;

/**
 * Define a un producto
 * @author Gerardo Portillo
 * @since  2023/06/19
 */
public class Producto {
    //atributos
    public String nombre;
    private CategoriaProducto categoria;
    public float precioVenta;
    //constructor
    /**
     * Crea un nuevo objeto de clase Producto
     * @param nombre        nombre del producto
     * @param categoria     categoria a la que pertenece, tipo CategoriaProducto
     * @param precioVenta   precio de venta del producto (valor float)
     */
    public Producto(String nombre, CategoriaProducto categoria, float precioVenta){
        if( categoria == null )
            throw new IllegalArgumentException("Categoria debe ser un objeto");
        else
            this.categoria = categoria;
        
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }
    //metodos
    /**
     * Devuelve la categoria del producto
     * @return  retorna un objeto de clase CategoriaProducto.
     */
    public CategoriaProducto getCategoria(){
        return this.categoria;
    }
}
