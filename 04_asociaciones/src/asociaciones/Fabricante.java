package asociaciones;

/**
 * Representa a un fabricante de productos
 * @author Gerardo Portillo
 * @since  2023/06/12
 */
public class Fabricante {
    //atributos
    public String nombre;
    public String pais;
    public String contacto;
    //constructor
    /**
     * Crea un nuevo objeto de clase Fabricante
     * @param nombre    nombre del fabricante
     * @param pais      pais del fabricante
     * @param contacto  persona de contacto para el fabricante
     */
    public Fabricante(String nombre, String pais, String contacto){
        this.nombre = nombre;        
        this.pais = pais;
        this.contacto = contacto;
    }
}
