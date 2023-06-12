package asociaciones;

/**
 * Representa a un operador de servicios telefonicos
 * @author Gerardo Portillo
 * @since  2023/06/12
 */
public class Operador {
    //atributos
    public String nombre;
    public String pais;
    //constructor
    /**
     * Crea un nuevo objeto de clase Operador
     * @param nombre    nombre del operador de servicios
     * @param pais      pais del operador de servicios
     */
    public Operador(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }
}
