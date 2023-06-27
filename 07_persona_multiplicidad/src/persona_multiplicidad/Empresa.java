package persona_multiplicidad;
/**
 * Representa a una Empresa
 * @author Gerardo Portillo
 * @since  2023-06-26
 */
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono){
        //la direccion es obligatoria, relacion por composicion
        if( direccion == null )
            throw new IllegalArgumentException("La direccion debe ser un objeto");
        else
            this.direccion = direccion;
        
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public Direccion getDireccion() {
        return this.direccion;
    }
}
