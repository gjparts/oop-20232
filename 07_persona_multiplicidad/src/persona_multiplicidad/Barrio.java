package persona_multiplicidad;

/**
 *  Representa a un barrio o colonia
 * @author Gerardo Portillo
 * @since  2023-06-26
 */
public class Barrio {
    //atributos
    public String nombre;
    public String zona;
    public String codigoPostal;
    //constructor
    public Barrio(String nombre, String zona, String codigoPostal){
        this.nombre = nombre;
        this.zona = zona;
        this.codigoPostal = codigoPostal;
    }
}
